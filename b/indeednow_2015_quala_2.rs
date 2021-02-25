use proconio::input;
use std::collections::HashMap;
fn main() {
    input! {
        n: u8,
        s: [String; n],
    }
    let mut map = HashMap::new();
    for c in "indeednow".chars() {
        let count = map.entry(c).or_insert(0);
        *count += 1;
    }
    for si in s.iter() {
        let mut si_map = HashMap::new();
        for c in si.chars() {
            let count = si_map.entry(c).or_insert(0);
            *count += 1;
        }
        let res = if map == si_map { "YES" } else { "NO" };
        println!("{}", res);
    }
}
