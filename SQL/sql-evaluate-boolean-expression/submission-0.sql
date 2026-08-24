-- Write your query below
select e.left_operand, e.operator, e.right_operand,
    case
        when e.operator = '>' AND v_left.value > v_right.value THEN 'true'
        when e.operator = '<' AND v_left.value < v_right.value THEN 'true'
        when e.operator = '=' AND v_left.value = v_right.value THEN 'true'
        else 'false'
    end as value
from expressions e
join variables v_left on v_left.name = e.left_operand
join variables v_right on v_right.name = e.right_operand