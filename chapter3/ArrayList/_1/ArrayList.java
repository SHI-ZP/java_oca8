import static java.lang.System.out;

public class ArrayList{
	public static void main(String... args) {
		out.println("add()");
		java.util.List<String> listAdd = new java.util.ArrayList<>();
		listAdd.add("a");
		out.println(listAdd.toString());
		listAdd.add(0, "b");
		out.println(listAdd.toString());
		// list.add(-1, "c");
		// list.add(99, "c");
		// list.add(0, 'c');

		out.println("remove()");
		java.util.List<Integer> listRemove = new java.util.ArrayList<>();
		//auto boxing not work
		listRemove.add(0);
		out.println(listRemove.remove(0));
		listRemove.add(0);
		out.println(listRemove.remove(new Integer(0)));

		listRemove.add(0);
		out.println(listRemove.remove(new String("0")));
		listRemove.add(0);
		// out.println(listRemove.remove(3));

		out.println("set()");
		java.util.List<String> listSet = new java.util.ArrayList<>();
		listSet.add("alia");
		listSet.set(0, "bliss");
		out.println(listSet.toString());

		// listSet.set(1, "charles");
		// listSet.set(0, 'c');

		out.println("isEmpty()");
		java.util.List<Double> listIsEmpty = new java.util.ArrayList<>();
		out.println(listIsEmpty.isEmpty());
		listIsEmpty.add(0.0);
		out.println(listIsEmpty.isEmpty());

		out.println("size()");
		java.util.List<Integer> listSize = new java.util.ArrayList<>();
		out.println(listSize.size());

		out.println("clear()");

		out.println("contains()");
		java.util.List<Integer> listContains = new java.util.ArrayList<>();
		listContains.add(1);
		out.println(listContains.contains(1));
		out.println(listContains.contains(new Integer(1)));

		out.println("sorting()");
		java.util.List<Integer> listSorting = new java.util.ArrayList<>();
		listSorting.add(2);
		listSorting.add(1);
		listSorting.add(3);

		out.println(listSorting.toString());
		java.util.Collections.sort(listSorting);
		out.println(listSorting.toString());

		out.println("toArray()");
		java.util.List<String> listToArray = new java.util.ArrayList<>();
		listToArray.add("a");
		listToArray.add("b");
		listToArray.add("c");

		Object[] objArray = listToArray.toArray();
		out.println(java.util.Arrays.toString(objArray));

		String[] strArray = listToArray.toArray(new String[0]);
		out.println(java.util.Arrays.toString(strArray));

		// strArray = listToArray.toArray(new int[0]);
		// out.println(java.util.Arrays.toString(strArray));
	}
}