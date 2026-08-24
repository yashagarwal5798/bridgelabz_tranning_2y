START

INPUT N

IF N <= 1
OUTPUT "Not Prime"
STOP

        i = 2

WHILE i * i <= N
IF N MOD i == 0
OUTPUT "Not Prime"
STOP
END IF

i = i + 1
END WHILE

OUTPUT "Prime"

END