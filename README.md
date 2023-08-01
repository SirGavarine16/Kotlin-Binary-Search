# Binary Search Algorithm in Kotlin

Its input is a sorted list of elements. If an element
you're looking for is in that list, binary search returns
the position where it's located. Otherwise, binary search
returns _null_.

While you haven't narrowed the search down to one element,
you check the middle element.
- If your guess is correct, you return the middle index.
- If your guess is too high, the middle - 1 becomes the highest index.
- If your guess is too low, the middle + 1 becomes the lowest index.