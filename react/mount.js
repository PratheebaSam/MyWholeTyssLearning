class parent extends React.Component {
  contructor(props) {
    super(props);
    this.state = {
      txt: "mounting phase",
    };
    console.log("constructor executed");
  }
  static getDerivedStatFromProps(props, state) {
    console.log("get derived props executed");
  }
  render() {
    console.log("render method executed");
    return <div>{this.state.txt}</div>;
  }
  componentDidMount() {
    console.log("componentdidmount method executed");
  }
}

reactDom.render(<Parent />, document.getElementById("root"));
