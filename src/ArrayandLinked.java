import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayandLinked {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		caculateTime("LinkedList ", linkedList);
		caculateTime("ArrayList ", arrayList);

	}

	public static void caculateTime(String data_type, List<Integer> list) {
		long startTime;
		long finishTime;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(0,i);
		}
		finishTime = System.currentTimeMillis();
		System.out.println(data_type + " adding time "+(finishTime - startTime) + " ms ");
	}
}
