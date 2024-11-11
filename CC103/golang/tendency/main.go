package main

import "fmt"

func main() {
	// LL UL f
	classMs := []int{}
	sumS := []int{}
	ll := [11]int{40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90}
	ul := [11]int{44, 49, 54, 59, 64, 69, 74, 79, 84, 89, 94}
	f := [11]int{3, 3, 4, 6, 6, 14, 9, 8, 2, 4, 1}

	// Freq N
	freqN := 0
	for i := 0; i < 11; i++ {
		freqN += f[i]
	}
	fmt.Printf("freqN: %v\n", freqN)

	// Xi
	for i := 0; i < 11; i++ {
		classMark := (ll[i] + ul[i]) / 2
		classMs = append(classMs, classMark)
	}
	fmt.Printf("classMs: %v\n", classMs)

	// fXi
	for i := 0; i < 11; i++ {
		sum := f[i] * classMs[i]
		sumS = append(sumS, sum)
	}
	fmt.Printf("sumS: %v\n", sumS)

	// ZfXi
	SUM := 0
	for i := 0; i < 11; i++ {
		SUM += sumS[i]
	}
	fmt.Printf("SUM: %v\n", SUM)

	// MEAN
	mean := float32(SUM) / float32(freqN)
	fmt.Printf("mean: %0.02f\n", mean)

	// <cf
	lcf := 0
	lcfS := []int{}
	for i := 0; i < 11; i++ {
		lcf += f[i]
		lcfS = append(lcfS, lcf)
	}
	fmt.Printf("lcfS: %v\n", lcfS)
	fmt.Printf("lcf: %v\n", lcf)

	// MEDIAN
	c := 5
	lmd := float32(ll[5]) - 0.5
	fmt.Printf("lmd: %v\n", lmd)
	cfb := float32(lcfS[4])
	fmt.Printf("cfb: %v\n", cfb)
	fmd := float32(float32(f[5]))
	fmt.Printf("fmd: %v\n", fmd)
	median := lmd + (((float32(freqN)/2)-cfb)/fmd)*float32(c)
	fmt.Printf("median: %v\n", median)

	// MODE
	lmo := lmd
	fmt.Printf("lmo: %v\n", lmo)
	fmo := fmd
	fmt.Printf("fmo: %v\n", fmo)
	f1 := f[4]
	fmt.Printf("f1: %v\n", f1)
	f2 := f[6]
	fmt.Printf("f2: %v\n", f2)
	mode := float32(lmo) + ((float32(fmo)-float32(f1)) / ((2 * fmo) - float32(f1) - float32(f2)) * float32(c))
	fmt.Printf("mode: %v\n", mode)
}
