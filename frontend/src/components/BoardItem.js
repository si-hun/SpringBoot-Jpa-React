import React from 'react';
import {Card} from "react-bootstrap";
import {Link} from "react-router-dom";

const BoardItem = (props) => {
    return (
        <Card>
            <Card.Body>
                <Card.Title>{props.item.title}</Card.Title>
                <Link to={"/board/view/" + props.item.id} className={"btn btn-primary"} variant={"primary"}/>
                상세보기
            </Card.Body>
        </Card>
    );
};

export default BoardItem;