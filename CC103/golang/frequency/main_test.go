package main

import (
	"testing"
)

// BenchmarkSortTable benchmarks the sortTable function
func BenchmarkMain(b *testing.B) {
	// Run the benchmark
	for i := 0; i < b.N; i++ {
		main()
	}
}
