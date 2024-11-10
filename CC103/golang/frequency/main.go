package main

import (
	"fmt"
	"reflect"
	"slices"
	"sort"
)

// TODO: organize code
func main() {
	scores := [50]int{
		53, 30, 58, 67, 46,
		41, 25, 44, 42, 40,
		31, 42, 15, 73, 47,
		39, 51, 33, 79, 56,
		64, 43, 65, 80, 54,
		47, 35, 25, 54, 52,
		20, 44, 58, 52, 48,
		62, 46, 44, 43, 55,
		66, 37, 65, 48, 75,
		67, 36, 63, 51, 40,
	}
	fmt.Println("SCORES:")
	printTable(scores)

	sorted := sortTableFunc(scores)
	fmt.Println("SORTED:")
	printTable(sorted)

	fmt.Printf("Range (R): %d\n", tableRange(sorted))
	classSize := 13
	classInterv := tableCsize(tableRange(sorted), classSize)
	fmt.Printf("Class Size (C): %d\n", classInterv)

	fmt.Println("Class Intervals:")
	INTERVALS := classInterval(sorted[0], classInterv, classSize)
	for i := range INTERVALS {
		fmt.Printf("[%d - %d]\n", INTERVALS[i][0], INTERVALS[i][len(INTERVALS[i])-1])
	}

	fmt.Println("Class Boundaries:")
	BOUNDARIES := classBound(sorted[0], classInterv, classSize)
	for i := range BOUNDARIES {
		fmt.Printf("[%0.2f - %0.2f]\n", BOUNDARIES[i][0], BOUNDARIES[i][len(BOUNDARIES[i])-1])
	}

	fmt.Println("Class Midpoint:")
	classMid := classMark(INTERVALS)
	for i := range classMid {
		fmt.Println(classMid[i])
	}

	fmt.Println("Frequency:")
	tally := freqTally(sorted[:], INTERVALS, classInterv)
	for i := range tally {
		fmt.Println(tally[i])
	}

	fmt.Println("UNGROUPED FREQUENCY DISTRIBUTION TABLE:")
	printTable(freqUngroup(sorted))
}

func printTable(input interface{}) {
	switch reflect.TypeOf(input).Kind() {
	case reflect.Array:
		table := input.([50]int)
		for i, y := range table {
			if (i+1)%5 != 0 {
				fmt.Printf("%d, ", y)
			} else {
				fmt.Printf("%d\n", y)
			}
		}
	case reflect.Map:
		table := input.(map[int]int)
		keys := make([]int, 0, len(table))
		for key := range table {
			keys = append(keys, key)
		}
		sort.Ints(keys)
		for _, y := range keys {
			fmt.Printf("%d:%d\n", y, table[y])
		}
	}
}

func sortTableFunc(table [50]int) [50]int {
	tableSlice := table[:]
	slices.Sort(tableSlice)
	var sorted [50]int
	copy(sorted[:], tableSlice)
	return sorted
}

func tableRange(table [50]int) int {
	return table[49] - table[0]
}

func tableCsize(tableR, classes int) int {
	return tableR / classes
}

// TODO: Turn over-engineered code into simple code
func classInterval(first, interv, size int) [][]int {
	arr := make([][]int, (size + 1))
	for i := range arr {
		arr[i] = make([]int, interv)
	}
	for i := 0; i < (size + 1); i++ {
		for j := 0; j < interv; j++ {
			arr[i][j] = first + i*interv + j
		}
	}
	return arr
}

// TODO: Turn over-engineered code into simple code
func classBound(first, interv, size int) [][]float32 {
	arr := make([][]float32, (size + 1))
	for i := range arr {
		arr[i] = make([]float32, interv+1)
	}
	firstF := float32(first)
	intervF := float32(interv)
	for i := 0; i < (size + 1); i++ {
		for j := 0; j < interv+1; j++ {
			arr[i][j] = firstF - 0.5 + float32(i)*intervF + float32(j)
		}
	}
	return arr
}

// TODO: Turn over-engineered code into simple code
func classMark(intervPoints [][]int) []int {
	midpoints := []int{}
	for i := range intervPoints {
		midpoints = append(midpoints, (intervPoints[i][0]+intervPoints[i][len(intervPoints[i])-1])/2)
	}
	return midpoints
}

// TODO: Turn over-engineered code into simple code
func freqTally(sorted []int, intervals [][]int, size int) []int {
	count := make([]int, len(intervals))
	for i := 0; i < len(intervals); i++ {
		for _, num := range sorted {
			if num >= intervals[i][0] && num <= intervals[i][size-1] {
				count[i]++
			}
		}
	}
	return count
}

func freqUngroup(table [50]int) map[int]int {
	m := make(map[int]int)
	for _, value := range table {
		m[value]++
	}
	return m
}
