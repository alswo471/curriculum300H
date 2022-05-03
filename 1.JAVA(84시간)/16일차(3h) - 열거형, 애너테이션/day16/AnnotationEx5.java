package day16;

import java.lang.annotation.*;

@interface ToDos {
	ToDo[] value();
}

@Repeatable(ToDos.class)
 @interface ToDo {
	String value();
}

@ToDo("�ڹ� ����")
@ToDo("�ڹٽ�ũ��Ʈ ����")
@ToDo("�����ͺ��̽� ����")
public class AnnotationEx5 {
	
}
