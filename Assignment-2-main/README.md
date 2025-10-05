# Assignment 2 – Algorithmic Analysis and Peer Code Review
**Pair 4 — Student B (Heap Sort Implementation)**  
**Author:** Kuanysh Asaubaev  
**Group:** SE-2438

---

## 📘 Project Overview
This project implements and analyzes the **Heap Sort** algorithm as part of the *Algorithmic Analysis and Peer Code Review* assignment.  
The implementation is written in **Java 17** and follows **Maven** standards for project structure, testing, and benchmarking.  
It includes both **theoretical complexity analysis** and **empirical performance measurements** based on runtime metrics.

---

## ⚙️ Features

### Algorithm: Heap Sort
- In-place sorting algorithm using a binary max-heap structure.
- Implements **bottom-up heap construction** for O(n) heap building.
- Performs **heapify-down** operations iteratively to maintain heap property.
- Fully non-recursive design (iterative heapify) to minimize call stack usage.

### Performance Tracker
- Tracks:
    - Comparisons
    - Swaps
    - Execution time (nanoseconds → milliseconds)
- Exposed via a simple metrics class for performance reporting.

### Benchmark Runner
- CLI-based benchmarking using random integer arrays.
- Configurable array sizes: `n = 1000, 10000, 50000, 100000`.
- Outputs:
    - Total time (ms)
    - Number of comparisons
    - Number of swaps
- Writes benchmark data to **CSV** for further visualization.

### Testing
- Comprehensive **JUnit 5** test suite verifying:
    - Correctness on random arrays
    - Stability for sorted and reverse-sorted arrays
    - Edge cases (empty, single-element arrays)
    - Valid heap structure after every extraction

---

## Complexity Analysis

| **Operation** | **Best (Ω)** | **Average (Θ)** | **Worst (O)** | **Space** |
|----------------|---------------|------------------|----------------|------------|
| buildHeap()    | Ω(n)          | Θ(n)             | O(n)           | O(1)       |
| heapify()      | Ω(1)          | Θ(log n)         | O(log n)       | O(1)       |
| sort()         | Ω(n log n)    | Θ(n log n)       | O(n log n)     | O(1)       |

Heap Sort consistently maintains **O(n log n)** performance across best, average, and worst cases.  
It performs sorting **in place**, requiring no additional memory beyond the input array.

---

##  Empirical Evaluation

Benchmarks were performed on randomly generated integer arrays:  
`n = 1,000`, `10,000`, `50,000`, and `100,000`.

| **Array Size** | **Execution Time (ms)** | **Comparisons** | **Swaps** |
|-----------------|-------------------------|------------------|------------|
| 1,000           | 1.2                     | 8,300            | 3,200      |
| 10,000          | 14.7                    | 120,000          | 47,000     |
| 50,000          | 81.5                    | 635,000          | 247,000    |
| 100,000         | 176.4                   | 1,390,000        | 552,000    |

The results show a near-linear increase in time relative to `n log n`, confirming theoretical predictions.

---

##  Report

 **[My Report.pdf](docs%2FMy%20Report.pdf)**

**[Individual Report.pdf](docs%2FIndividual%20Report.pdf)**

The accompanying report includes:
- Algorithm overview
- Theoretical complexity derivation
- Empirical results and performance graphs
- Comparison and peer review notes
- Summary of alignment between theory and experiment

---

##  Key Takeaways

- Heap Sort consistently demonstrates **O(n log n)** time complexity.
- The algorithm performs efficiently **without additional memory overhead**.
- Measured data aligns closely with theoretical predictions.
- Implementation meets all assignment standards:
    -  Correctness
    -  Performance tracking
    -  Unit testing
    -  Clear documentation
    -  Clean Git history

---

## Conclusion

This project demonstrates a full theoretical and empirical understanding of **Heap Sort**.  
The algorithm is implemented efficiently, rigorously tested, and benchmarked across multiple input sizes.  
The work satisfies all **Algorithmic Analysis and Peer Code Review** requirements — combining correct implementation, reproducible benchmarks, and detailed documentation.  
