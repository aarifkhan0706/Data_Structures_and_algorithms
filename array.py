#python code to demonstrate the working of array(),append(),insert()
import array
#initializing array with values
#iniitalizes array with signed integer
arr= array.array('i',[1,2,3])
#printing the original array
print("The original array is :",end=" ")
for i in range(0,3):
    print(arr[i],end='')
print("\r")#gives one line after output
#using append for adding new value at the end
arr.append(4)
print("The new array is :",end=" ")
for i in range(0,4):
    print(arr[i],end=' ')
print("\r")
#using insert which will append the value at indec 1 with value 2
arr.insert(1,2)
print("The new array is :",end=" ")
for i in range(0,5):
    print(arr[i],end=' ')
print("\r")
#using pop which will remove the value ,all the value
arr.pop(2)
print("The new array is :",end=" ")
for i in range(0,4):
    print(arr[i],end=' ')
print("\r")
#using remove for only removing one value , if there is multiple occurrence of the same value then the first occurrence is removed
arr.remove(1)
print("The new array is :",end=" ")
for i in range(0,2):
    print(arr[i],end=' ')
print("\r")
print(arr.index(2))
arr.reverse()
print("The new array is :",end=" ")
for i in range(0,3):
    print(arr[i],end=" ")
print("\r")
print(arr.typecode)#it returns the datatype with which we initialise the array
print(arr.itemsize)#returns size of the array and ignores multiple occurence
print(arr.buffer_info())#returns a tuple with the address and size of array
print(arr.count(1))#returns the occurence of the element in the array
arr2=array.array('i',[9,8,7,6])
print("The new array two is :",end=" ")
for i in arr2:
    print(i,end=" ")
print("\r")
arr.extend(arr2)#it adds the both array in one
for i in arr:
    print(i,end=" ")
print("\r")
li=[11,12,13]#a list
arr.fromlist(li)#it appends the list at the end of the array
for i in arr:
    print(i,end=" ")
print("\r")
list1=arr.tolist()#it converts an array into list
print(type(list1))

