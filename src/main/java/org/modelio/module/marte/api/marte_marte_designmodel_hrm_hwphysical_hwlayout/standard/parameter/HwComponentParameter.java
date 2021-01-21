/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwComponent_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8aa1dcb0-cd42-4f12-b224-b8f24e22c6c7")
public class HwComponentParameter extends HwResourceParameter {
    @objid ("0bf0a518-e160-4217-a987-9505c09e2e5b")
    public static final String STEREOTYPE_NAME = "HwComponent_Parameter";

    @objid ("d01bea2d-58cc-41c8-8cd8-75380d4c35c8")
    public static final String HWCOMPONENT_PARAMETER_AREA_TAGTYPE = "HwComponent_Parameter_area";

    @objid ("21336283-2542-401a-b89a-669ce77cb068")
    public static final String HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE = "HwComponent_Parameter_dimensions";

    @objid ("2bd19dd9-afde-41e2-80df-f4df007fefc7")
    public static final String HWCOMPONENT_PARAMETER_GRID_TAGTYPE = "HwComponent_Parameter_grid";

    @objid ("24941566-51a3-4d58-9e2d-2d99a713d98e")
    public static final String HWCOMPONENT_PARAMETER_KIND_TAGTYPE = "HwComponent_Parameter_kind";

    @objid ("975e7c5e-85d9-45b9-b8e9-8a3bdd4a24bb")
    public static final String HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE = "HwComponent_Parameter_nbPins";

    @objid ("f9d981ed-a2f1-47c2-9acc-899baba2bb3b")
    public static final String HWCOMPONENT_PARAMETER_POSITION_TAGTYPE = "HwComponent_Parameter_position";

    @objid ("ef5e85e8-8327-4bd0-8b47-5866e74c7b51")
    public static final String HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE = "HwComponent_Parameter_poweredServices";

    @objid ("3fe4e755-8ef6-4adc-9b8a-ceae2bfd6651")
    public static final String HWCOMPONENT_PARAMETER_PRICE_TAGTYPE = "HwComponent_Parameter_price";

    @objid ("f8281665-1160-4c1c-96a6-31c7fe426e8c")
    public static final String HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE = "HwComponent_Parameter_r_Conditions";

    @objid ("9774e192-3f2c-423c-95db-ecb77540343c")
    public static final String HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE = "HwComponent_Parameter_staticConsumption";

    @objid ("a6d06c48-f6e5-43d4-88a8-cd1ec185105a")
    public static final String HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE = "HwComponent_Parameter_staticDissipation";

    @objid ("688f2833-d6eb-4ef2-8915-f216121be2f2")
    public static final String HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE = "HwComponent_Parameter_subComponents";

    @objid ("ecf9ea26-40b4-45a6-a69f-f7dcec2af073")
    public static final String HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE = "HwComponent_Parameter_weight";

    /**
     * Tells whether a {@link HwComponentParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwComponent_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("71351652-1be0-45f5-b5af-73e47634341f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwComponent_Parameter >> then instantiate a {@link HwComponentParameter} proxy.
     * 
     * @return a {@link HwComponentParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a54880cc-25dc-4fb9-9f64-a16d9c9f555b")
    public static HwComponentParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentParameter.STEREOTYPE_NAME);
        return HwComponentParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentParameter} proxy from a {@link Parameter} stereotyped << HwComponent_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwComponentParameter} proxy or <i>null</i>.
     */
    @objid ("6dfc4a91-798b-4392-9d2e-130d3b5a4b5a")
    public static HwComponentParameter instantiate(final Parameter obj) {
        return HwComponentParameter.canInstantiate(obj) ? new HwComponentParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentParameter} proxy from a {@link Parameter} stereotyped << HwComponent_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwComponentParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("30e897d3-f6a6-43e5-9b79-4614bfd68ab1")
    public static HwComponentParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwComponentParameter.canInstantiate(obj))
        	return new HwComponentParameter(obj);
        else
        	throw new IllegalArgumentException("HwComponentParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5dc63fea-20ad-47fd-b19e-fa288bc648b5")
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
        HwComponentParameter other = (HwComponentParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("aaa60989-34ec-4b6c-9015-d223eab9a5dc")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Parameter_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a531c4cb-9d17-4e91-8ed1-4c375ec032d8")
    public String getHwComponent_Parameter_area() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("52fd6e91-a0d6-4177-8903-04fc642a3bb7")
    public List<String> getHwComponent_Parameter_dimensions() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6920aa97-2615-4f84-92af-f2e6b63c4fbb")
    public List<String> getHwComponent_Parameter_grid() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50fe4451-d4ac-4242-9872-6bd444d27427")
    public String getHwComponent_Parameter_kind() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d65e2b7-6be5-47bc-83c6-e162bf59e210")
    public String getHwComponent_Parameter_nbPins() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e4874857-59c5-459e-b5f2-fe9e46f9e9c6")
    public List<String> getHwComponent_Parameter_position() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("02a6ae2c-e985-4f48-b0e8-4b14fbccb6ed")
    public List<String> getHwComponent_Parameter_poweredServices() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("096a8eac-a5b7-4ece-9208-f1f8b4ae6b21")
    public String getHwComponent_Parameter_price() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("50e76d17-f1d6-4587-9ead-253860ccd27f")
    public List<String> getHwComponent_Parameter_r_Conditions() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08f0cb3d-b768-453c-9c41-9c2c1f98fce1")
    public String getHwComponent_Parameter_staticConsumption() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("efd64ecb-8cc4-43f6-97d5-3ee08b53b519")
    public String getHwComponent_Parameter_staticDissipation() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c4c28ab0-5d7e-442b-ad0b-ca7023c13ee9")
    public List<String> getHwComponent_Parameter_subComponents() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a89caab-62c5-4c7c-bf3e-8a92557ebfa3")
    public String getHwComponent_Parameter_weight() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("2bb45c3f-12f1-4b17-894a-dffec2636000")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Parameter_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72f89090-942e-47dc-a6ac-e0eb27dbfce8")
    public void setHwComponent_Parameter_area(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90ac5937-1cbc-488d-8c9e-808b712dff48")
    public void setHwComponent_Parameter_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c535ab81-67b0-4b05-af23-835be220b2af")
    public void setHwComponent_Parameter_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37d449ab-eb2c-40d0-85e7-e78a724a4616")
    public void setHwComponent_Parameter_kind(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26d53891-d5f7-493e-ad1d-1c9293834fe6")
    public void setHwComponent_Parameter_nbPins(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("133d7869-9037-444e-a569-4d7b5839e573")
    public void setHwComponent_Parameter_position(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("618057e1-f00d-4991-a2d0-5cefc7f918f2")
    public void setHwComponent_Parameter_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96e9551c-9d45-4e80-b805-77e8df50bd90")
    public void setHwComponent_Parameter_price(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91c78cf1-dc69-40d9-be06-b0666ac67e5f")
    public void setHwComponent_Parameter_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("defce794-fc8b-4d33-bbe5-5e3cd2c2c4b5")
    public void setHwComponent_Parameter_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bff0dd7a-a887-4ea7-b682-75a48315697c")
    public void setHwComponent_Parameter_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa2a531e-07e5-4bd4-8801-6b9ae69a476c")
    public void setHwComponent_Parameter_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a349d88-b34a-4f6b-bbbb-768f6a35bd6e")
    public void setHwComponent_Parameter_weight(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("90a5c1b4-eb68-4ec8-a75c-433b8f30cb7b")
    protected HwComponentParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("cdfb1ae0-3fff-4576-9b55-3900a15488b7")
    public static final class MdaTypes {
        @objid ("a1cab8d6-5501-4c25-aa37-1583444f3243")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("961ac2ee-1c62-4941-a1db-94095e050387")
        public static TagType HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT;

        @objid ("a28c8ac2-bca6-4e27-8d55-2874374a360c")
        public static TagType HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT;

        @objid ("ab185350-834f-4e1a-bc44-1ff1cc671638")
        public static TagType HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT;

        @objid ("afe82195-f06b-44dc-897b-3ab9b710aea4")
        public static TagType HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT;

        @objid ("e5a19049-2d90-4d46-a19b-53b10ce892a4")
        public static TagType HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT;

        @objid ("43ed58d0-2a06-4c6d-aa4a-0de7140bf949")
        public static TagType HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT;

        @objid ("1a48be60-fd3d-426a-938a-e59fc4e34c12")
        public static TagType HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT;

        @objid ("b1d3eaf3-b08e-404d-9f71-8fc91d771390")
        public static TagType HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT;

        @objid ("8680310b-453d-4c32-abe3-1d127961093a")
        public static TagType HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("0ff6c7ce-09b0-4350-abe2-80f6e99a9d1a")
        public static TagType HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("5c390e6f-c7af-4164-822f-15931e1ed18b")
        public static TagType HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("ff3ad11d-7ae7-479d-a6e7-46aede213717")
        public static TagType HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("6b6f14a4-f541-4905-b808-7b0c01150fbb")
        public static TagType HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("6a3e5865-1087-4f93-8550-91096937aecf")
        private static Stereotype MDAASSOCDEP;

        @objid ("919d60c5-7771-4088-85aa-ae6b7a4074f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a241947-bddf-477c-984d-d103ddb9f577")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01868a84-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ecdc-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece3-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ecea-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f2c-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f33-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f3a-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f41-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f48-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f4f-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f56-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db17f-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db186-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db18d-0ccf-11df-8525-001302895b2b");
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
