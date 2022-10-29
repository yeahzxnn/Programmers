def solution(numbers):
    numbers_str = [str(num) for num in numbers]
    numbers_str.sort(key=lambda num: num*3, reverse = True)
    return str(int(''.join(numbers_str)))
print(solution([6,10,12]))
print(solution([3, 30, 34, 5, 9]))     
print(solution([0,0,0,0]))  
