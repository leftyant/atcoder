fn main() {
    let s = {
        let mut buf = String::new();
        std::io::stdin().read_line(&mut buf).unwrap();
        buf.trim_end().to_owned()
    };
    let w_iter = s.split_whitespace();
    let mut ans = String::new();
    for w in w_iter {
        ans.push_str(match w {
            "Left" => "< ",
            "Right" => "> ",
            _ => "A ",
        });
    }
    println!("{}", ans.trim_end());
}
