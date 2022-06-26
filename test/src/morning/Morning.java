package morning;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Morning {
	public static void main(String[] args) {
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "aaa"));
//		list.add(new Student(2, "bbb"));
//		list.add(new Student(4, "ddd"));
//		list.add(new Student(3, "ccc"));
//		list.sort((s1, s2) -> -s1.compareTo(s2));
//		Iterator iterator = list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		Set<Teacher> set = new HashSet<>();
		set.add(new Teacher(1,"aaa"));
		set.add(new Teacher(2, "bbb"));
		set.add(new Teacher(1, "ccc"));
		set.add(new Teacher(3, "bbb"));
		set.add(new Teacher(3, "bbb"));
		set.forEach(System.out::println);
	}
}

class Student implements Comparable<Student>{
	int id;
	String name;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}	
}

class Teacher{
	int id;
	String name;
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	@Override
    public int hashCode() {
        // Objects 有 hash() 方法可以使用
        // 以下可以簡化為 return Objects.hash(name, number);
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }
	@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
	
	
}