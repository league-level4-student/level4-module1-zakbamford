package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	private T[] arr;

	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < arr.length)
			return arr[loc];
		else
			throw new IndexOutOfBoundsException("");
	}

	public void add(T val) {
		T[] temp = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[i];
		temp[arr.length] = val;
		arr = temp;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < arr.length - 1) {
			T[] temp = (T[]) new Object[arr.length + 1];
			for (int i = arr.length - 1; i >= 0; i--) {
				if (i < loc)
					temp[i] = arr[i];
				if (i >= loc)
					temp[i + 1] = arr[i];
			}
			temp[loc] = val;
			arr = temp;
		} else
			throw new IndexOutOfBoundsException();
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < arr.length)
			arr[loc] = val;
		else
			throw new IndexOutOfBoundsException();
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc >= arr.length)
			throw new IndexOutOfBoundsException();
		T[] temp = (T[]) new Object[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < loc)
				temp[i] = arr[i];
			if (i > loc)
				temp[i - 1] = arr[i];
		}
		arr = temp;
	}

	public boolean contains(T val) {
		for (T obj : arr) {
			if (val.equals(obj))
				return true;
		}
		return false;
	}

	public int size() {
		return arr.length;
	}
}
