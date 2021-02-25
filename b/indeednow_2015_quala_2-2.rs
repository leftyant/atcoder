fn main() {
    let n: usize = parseln();
    for _i in 0..n {
        let s: String = parseln();
        let mut chars: Vec<_> = s.chars().collect();
        chars.sort();
        let ss: String = chars.into_iter().collect();
        let res = if ss == "ddeeinnow" { "YES" } else { "NO" };
        println!("{}", res);
    }
}

fn parseln<T: std::str::FromStr>() -> T {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf.trim_end().parse().ok().unwrap()
}