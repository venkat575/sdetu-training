package datastructures;

public class Playgrounod {
	
	public static void main(String[] args) {
		DynamicArrayList array = new DynamicArrayList();
		array.add(5);
		
		array.add(10);
		array.add(25);
		array.add(13);
		
		System.out.println(array.size());
		
		System.out.println(array.get(2));
		System.out.println(array.get(1));
		
		array.add(5);
		System.out.println(array.toString());
		array.remove(3);
		System.out.println(array.toString());
	}

}

class DynamicArrayList {
	private int[] nums = new int[0];
	
	public void add(int value) {
		expand();
		nums[nums.length-1] = value;
	}
	
	public void remove(int value) {
		int[] temp = nums;
		nums = new int[nums.length-1];
		for (int i=0; i<value; i++) {
			nums[i] = temp[i];
		}
		for (int i=value; i<temp.length; i++) {
			nums[i-1] = temp[i];
		}
	}
	
	private void expand() {
		int[] temp = nums;
		nums = new int[nums.length+1];
		for (int i=0; i<temp.length; i++) {
			nums[i] = temp[i];
		}
	}
	
	public int get(int value) {
		return nums[value];
	}
	
	public int size() {
		return nums.length;
	}
	
	
	public String toString() {
		String message = "[ ";
		for (int i=0; i<this.size(); i++) {
			message = message + nums[i] + " ";
		}
		return message + "]";
	}
	
}
