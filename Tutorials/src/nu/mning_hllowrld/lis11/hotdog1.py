# Hello World - Second Edition by Warren & Carter Sande
# Listing 11.6 Hot Dog Combinations

print("\tDog\tBun\tKetchup\tMustard\tOnion")
count = 1

dog_cal = 140
bun_cal = 120
mus_cal = 20
ket_cal = 80
onion_cal = 40

for dog in [0, 1]:
    for bun in [0, 1]:
        for ketchup in [0, 1]:
            for mustard in [0, 1]:
                for onion in [0, 1]:
                    tot_cal = dog * dog_cal + bun * bun_cal + \
                        mustard * mus_cal + ketchup * ket_cal + \
                        onion * onion_cal
                    print("#", count, "\t",
                        dog,"\t",bun,"\t",ketchup,"\t",
                        mustard, "\t", onion, "\t", tot_cal)
                    count += 1

#tot_cal = dog * dog_cal + bun * bun_cal + \
#    mustard * mus_cal + ketchup * ket_cal + \
#    onion * onion_cal
#print(tot_cal)


