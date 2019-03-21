#!/bin/bash


p[i]=0; 
b[i]=0; 
t[i]=0;
pro[i]=0; 
total=0;
avg_wt=0;
tat[i]=0;

echo "Enter the number of processes"
read n

echo "Enter the burst time and Priority"
for(( i=0;i<n;i++ ))
do
	echo "P[$i]"
	echo "Burst Time"
	read b[i]
	echo "Priority"
	read pro[i]
	(( p[i] = i + 1 ))
done

for (( i=1; i<n; i++ ))
do
	(( pos = i ))
	for(( j=i+1; j<n; j++ ))
	do
			if[ pro[j]<pro[pos] ]
			then
				((pos = j))
	done
	(( temp = pro[i] ))
	(( pro[i] = pro[pos] ))
    (( pro[pos] = temp ))
 
    (( temp = b[i] ))
    (( b[i] = b[pos] ))
    (( b[pos] = temp ))
 
    (( temp = p[i] ))
    (( p[i] = p[pos] ))
    (( p[pos] = temp ))

done

 (( wt[0]=0 ))

for(( i=1;i<n;i++ ))
do
    (( wt[i] = 0 ))
    for(( j=0;j<i;j++ ))
    do
        (( wt[i] += b[j] ))
 	done

        (( total += wt[i] ))
done

(( avg_wt = total/n ))
    (( total=0 ))

    echo "\nProcess\t    Burst Time    \tWaiting Time\tTurnaround Time"
    for(( i=0;i<n;i++ ))
    do
        (( tat[i] = b[i] + wt[i] ))
        (( total += tat[i] ))
        echo "\nP[$i]\t\t  b[$i]\t\t    wt[$i]\t\t\t tat[$i]"
    done
 
    (( avg_tat = total/n ))
    echo "\n\nAverage Waiting Time = $avg_wt"
    echo "\nAverage Turnaround Time= $avg_tat"