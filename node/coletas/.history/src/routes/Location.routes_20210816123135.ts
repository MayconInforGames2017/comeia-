import { Router } from "express";
import LocationController from "../controllers/LocationController";

const locationRouter = Router();

const itemController = new ItemController();

locationRouter.get('/', locationRouter.index);


export default locationRouter;