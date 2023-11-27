# JCORE-3

Последняя подзадача действительно хитрая, она скорее на понимание работы интерфейса Iterable, когда мы можем наделить свой собственный объект свойством быть перечисляемым:

class EmployeeHolder implements Iterable<Employee>{

    private final List<Employee> employees;

    public EmployeeHolder(List<Employee> employees){
        this.employees = employees;
    }

    @NotNull
    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}
Таким образом, мы можем работать с перебором коллекции не напрямую, в качестве источника перечисления выступает наш собственный объект:

EmployeeHolder holder = new EmployeeHolder(Arrays.stream(employees).toList());
for (Employee employee : holder) {
        System.out.println(employee);
}
