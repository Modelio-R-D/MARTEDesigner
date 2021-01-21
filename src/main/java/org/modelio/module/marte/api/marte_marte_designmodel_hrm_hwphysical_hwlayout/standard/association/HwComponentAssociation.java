/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwComponent_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fa4201b7-13b3-4c09-b340-1d6447ee4318")
public class HwComponentAssociation extends HwResourceAssociation {
    @objid ("ff9857fe-4a8a-4d6a-b400-6c3fe8eae912")
    public static final String STEREOTYPE_NAME = "HwComponent_Association";

    @objid ("ba09eef2-d991-4571-8013-b9a2e54fadce")
    public static final String HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE = "HwComponent_Association_area";

    @objid ("1892cc27-ddf8-4004-8c11-d23a6b0d292c")
    public static final String HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE = "HwComponent_Association_dimensions";

    @objid ("d173712c-f419-4d07-a7fd-b113afd101f6")
    public static final String HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE = "HwComponent_Association_grid";

    @objid ("0a3c2613-7bba-4c68-b3b1-bc366ed0e424")
    public static final String HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE = "HwComponent_Association_kind";

    @objid ("75321492-45c1-4be7-b936-8dfda8b1b3d3")
    public static final String HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE = "HwComponent_Association_nbPins";

    @objid ("26044773-8e4d-46e3-ad69-44024d5c73b2")
    public static final String HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE = "HwComponent_Association_position";

    @objid ("d50e9dfe-7d06-478e-bc40-822f02484c49")
    public static final String HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE = "HwComponent_Association_poweredServices";

    @objid ("5bc46717-6673-4721-832e-5fd067a1f9b4")
    public static final String HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE = "HwComponent_Association_price";

    @objid ("6f031a9c-e5da-4bd5-8828-51ed54da0ea8")
    public static final String HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE = "HwComponent_Association_r_Conditions";

    @objid ("5ae890fc-2846-4cc5-bbdb-0378a2532bc4")
    public static final String HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE = "HwComponent_Association_staticConsumption";

    @objid ("f7b07fe2-6fd6-468d-8da5-9dee648c73ec")
    public static final String HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE = "HwComponent_Association_staticDissipation";

    @objid ("e2874b89-fa1d-4190-b3f9-b8cdc791fbb9")
    public static final String HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE = "HwComponent_Association_subComponents";

    @objid ("870f89ea-e8d8-41f5-91bf-27785fbb98c0")
    public static final String HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE = "HwComponent_Association_weight";

    /**
     * Tells whether a {@link HwComponentAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwComponent_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0ff767e1-e6fb-4c26-a076-3490212a32d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwComponent_Association >> then instantiate a {@link HwComponentAssociation} proxy.
     * 
     * @return a {@link HwComponentAssociation} proxy on the created {@link Association}.
     */
    @objid ("9afbe1c9-4bef-496b-9d80-1a8ffc0fe179")
    public static HwComponentAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociation.STEREOTYPE_NAME);
        return HwComponentAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociation} proxy from a {@link Association} stereotyped << HwComponent_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwComponentAssociation} proxy or <i>null</i>.
     */
    @objid ("216ba07b-d495-4fa0-99e3-f00f7d57715c")
    public static HwComponentAssociation instantiate(final Association obj) {
        return HwComponentAssociation.canInstantiate(obj) ? new HwComponentAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociation} proxy from a {@link Association} stereotyped << HwComponent_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwComponentAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3fdeaadc-efa5-4c00-9f63-f03bcb4c7fb9")
    public static HwComponentAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwComponentAssociation.canInstantiate(obj))
        	return new HwComponentAssociation(obj);
        else
        	throw new IllegalArgumentException("HwComponentAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e32d30ea-5c79-46d9-8987-6ba42c1f3416")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwComponentAssociation other = (HwComponentAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("38b3c68e-eccd-42d7-a960-c7a705ac52cd")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Association_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45b9d2be-730d-4ab5-ad14-6585be95a463")
    public String getHwComponent_Association_area() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0016fffd-a47e-486c-925b-a7b4ea9a20c0")
    public List<String> getHwComponent_Association_dimensions() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c02bb019-62d1-493b-997c-0b313341b510")
    public List<String> getHwComponent_Association_grid() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe0d3476-ceb4-4082-a4ee-5d355da65158")
    public String getHwComponent_Association_kind() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd9d2772-8c46-4f0b-b210-448cda8eebf1")
    public String getHwComponent_Association_nbPins() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("128789cd-2398-4983-9e83-6b9a262dc7f7")
    public List<String> getHwComponent_Association_position() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("00d9d45b-4dae-405c-a620-9121b54fce39")
    public List<String> getHwComponent_Association_poweredServices() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("226b75d5-9194-41b4-9c6f-e990710d6ca2")
    public String getHwComponent_Association_price() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("94928cc2-0cff-48bc-8aa0-c38b079827fa")
    public List<String> getHwComponent_Association_r_Conditions() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96273201-032a-4410-b2ad-b01fcfe4d98d")
    public String getHwComponent_Association_staticConsumption() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("095711ee-e8f6-48b9-b652-7b3190d898e5")
    public String getHwComponent_Association_staticDissipation() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("80af9f1e-abf5-4f33-94e5-18136b5e4131")
    public List<String> getHwComponent_Association_subComponents() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8342f20-d782-4776-aeab-7914990b2bc2")
    public String getHwComponent_Association_weight() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("70a02fb2-9ec5-4a0b-86ea-0375b9ebbafc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Association_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb40f721-029c-4c96-be97-6a349239ec9e")
    public void setHwComponent_Association_area(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0677e251-b9cb-4a8c-b0bf-cddc04600028")
    public void setHwComponent_Association_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("677dba5c-d70e-4d34-88d4-371a107339ee")
    public void setHwComponent_Association_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67c4dcb9-67c0-447e-889d-8db409ad8eb6")
    public void setHwComponent_Association_kind(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Association_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80a8d59d-63e3-4ca4-b71e-fbe1e534442d")
    public void setHwComponent_Association_nbPins(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33bb0b13-cda9-40c4-a3ba-bf252f6ae520")
    public void setHwComponent_Association_position(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c71e0d18-38ca-4720-9bfd-45971d79c6d2")
    public void setHwComponent_Association_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83aadcf1-d69f-4450-bf95-6cff294d6ad0")
    public void setHwComponent_Association_price(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1671e573-0acf-43d0-891b-2904df64b30b")
    public void setHwComponent_Association_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9af56d4c-f97a-434f-a97f-3659a9bdd134")
    public void setHwComponent_Association_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Association_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a77b215d-d016-48f6-8491-36d59a762063")
    public void setHwComponent_Association_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b24aab7-8952-41fa-847e-78d9f7a69bfc")
    public void setHwComponent_Association_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2b49af3-f90e-402c-b37e-19853c4a32a3")
    public void setHwComponent_Association_weight(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("250e260b-9033-4333-a237-f501bcf6d4f4")
    protected HwComponentAssociation(final Association elt) {
        super(elt);
    }

    @objid ("7df58b48-7063-41a7-9667-30ea8854c2f0")
    public static final class MdaTypes {
        @objid ("a9d6c4bc-6b19-472f-8406-c744b28b5c45")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ac3b711-719a-4dab-8328-666032f32d2c")
        public static TagType HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT;

        @objid ("2686d93a-7751-4483-ab02-35fde753de50")
        public static TagType HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT;

        @objid ("6c2f6db8-26c1-4a65-be71-9e3a3d743b9e")
        public static TagType HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT;

        @objid ("c4b27350-5c78-4dcf-b3ef-d9c19329f79d")
        public static TagType HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT;

        @objid ("947ab6ab-ce94-4b46-af4d-cd3488134702")
        public static TagType HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT;

        @objid ("c79008bc-8e31-4549-a8d3-f7290fe7ac83")
        public static TagType HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT;

        @objid ("9795314c-d5ab-4257-ae83-92e0f6ca65f2")
        public static TagType HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT;

        @objid ("5f801e1e-cd63-4cc1-929d-160753f7ac47")
        public static TagType HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT;

        @objid ("692e2ab0-f50c-4002-8c46-aac7abfd6cea")
        public static TagType HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("182f9379-0675-48fd-adac-f4caa9eedaa3")
        public static TagType HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("975a37e0-e3f4-4e6e-b7e8-da0b13de0d36")
        public static TagType HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("da050952-8864-4870-9aa5-8bcf8e7ca99c")
        public static TagType HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("36df86e6-27cd-480b-b4e5-9e399db9fa44")
        public static TagType HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("d1e0abbc-f141-4bfc-8b50-1c5ca0ac561f")
        private static Stereotype MDAASSOCDEP;

        @objid ("e1fb0755-4339-456c-be01-9b6d5f435b9b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96fe1c87-f270-4931-998c-f6b251af9060")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76a0ebe6-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebeb-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebe7-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebec-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebed-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebe8-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebe9-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebea-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebee-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebef-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf0-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf1-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf2-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf3-10b4-11df-81d9-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
