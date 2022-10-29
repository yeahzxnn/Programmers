#deque이용하면 빠르니까 deque이용하는 걸로 풀이
def solution(priorities, location):
    answer = 0
    from collections import deque
    
    d= deque([(v,i) for i,v in enumerate(priorities)])
    
    while len(d):
        item = d.popleft()
        if d and max(d)[0] > item[0]:
            d.append(item)
        else:
            answer +=1
            if item[1] == location:
                break
    return answer
