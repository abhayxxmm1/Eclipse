# Static Methods of `java.util.Collections`

## 🔹 Basic Operations

| Method | Description |
|--------|-------------|
| `sort(List)` | Sorts a list in ascending order. |
| `reverse(List)` | Reverses the order of elements. |
| `shuffle(List)` | Randomly shuffles the elements. |
| `swap(List, i, j)` | Swaps elements at two positions. |

---

## 🔹 Searching & Finding Values

| Method | Description |
|--------|-------------|
| `max(Collection)` | Returns the maximum element. |
| `min(Collection)` | Returns the minimum element. |
| `binarySearch(List, key)` | Searches in a **sorted** list and returns index. |
| `frequency(Collection, Object)` | Counts occurrences of an element. |

---

## 🔹 Copying & Replacing

| Method | Description |
|--------|-------------|
| `copy(dest, src)` | Copies elements from src → dest (dest must be same size or bigger). |
| `fill(List, value)` | Replaces all elements with a given value. |

---

## 🔹 Thread Safety & Unmodifiable Collections

| Method | Description |
|--------|-------------|
| `synchronizedList(List)` | Returns thread-safe list. |
| `synchronizedSet(Set)` | Returns thread-safe set. |
| `synchronizedMap(Map)` | Returns thread-safe map. |
| `unmodifiableList(List)` | Returns read-only list. |
| `unmodifiableSet(Set)` | Returns read-only set. |
| `unmodifiableMap(Map)` | Returns read-only map. |

---

## 🔹 Misc Utility Methods

| Method | Description |
|--------|-------------|
| `disjoint(Collection a, Collection b)` | Returns true if two collections have no common elements. |
| `emptyList()` | Returns an immutable empty list. |
| `emptySet()` | Returns an immutable empty set. |
| `emptyMap()` | Returns an immutable empty map. |


---

| Feature / Concept | `this()` Call Statement | `super()` Call Statement |
|------------------|--------------------------|----------------------------|
| Purpose | Calls another constructor in the **same class** | Calls constructor of the **parent class** |
| Relation | Same class constructor chaining | Inheritance: child → parent |
| Position | Must be the **first line** in a constructor | Must be the **first line** in a constructor |
| Default Behavior | Not inserted by Java automatically | Java inserts `super()` automatically if not written |
| Use Case | Reduce code duplication within class | Initialize parent properties before child |
| Example | `this(10);` | `super(10);` |
| Limitation | Only one `this()` allowed in a constructor | Only one `super()` allowed in a constructor |
| Combination | Cannot be used with `super()` in same constructor | Cannot be used with `this()` in same constructor |

---

| Feature / Usage | `this` Keyword | `super` Keyword |
|-----------------|----------------|------------------|
| Refers to | Current class object | Parent class object |
| Access variables | Access current class variables | Access parent class variables |
| Access methods | this.method() | super.method() |
| Constructor call | this() calls current class constructor | super() calls parent class constructor |
| Use case | Resolve current class ambiguity | Access overridden methods or hidden variables |
| Implicit call | No implicit use | `super()` is implicitly called if not written |
| Inheritance relation | Only within same class | Requires inheritance |
| Example use | this.name = name; | super.display(); |