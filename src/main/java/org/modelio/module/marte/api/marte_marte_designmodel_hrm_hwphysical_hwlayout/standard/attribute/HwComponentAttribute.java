/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwComponent_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ab702ab6-05ce-40fa-9237-e6d4867da3c9")
public class HwComponentAttribute extends HwResourceAttribute {
    @objid ("27dc8ee4-50a9-475f-b669-0c02bba41a8d")
    public static final String STEREOTYPE_NAME = "HwComponent_Attribute";

    @objid ("fb2645bc-d7a4-4a95-9ad5-a6b74c225b38")
    public static final String HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE = "HwComponent_Attribute_area";

    @objid ("68f4255e-ecf0-41db-b791-d8bd97be4225")
    public static final String HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE = "HwComponent_Attribute_dimensions";

    @objid ("91e8cc3a-b03e-4728-baed-29e6a95d312d")
    public static final String HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE = "HwComponent_Attribute_grid";

    @objid ("58c6c9e5-69bd-462c-b142-9b71d21a6680")
    public static final String HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE = "HwComponent_Attribute_kind";

    @objid ("3b4088d3-8b44-436d-ab9c-7933dc33575f")
    public static final String HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE = "HwComponent_Attribute_nbPins";

    @objid ("acdeb4f7-43ba-41b7-b295-f20f149441a6")
    public static final String HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE = "HwComponent_Attribute_position";

    @objid ("246e44fb-8c3e-4eef-8049-9ea6ea73e130")
    public static final String HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE = "HwComponent_Attribute_poweredServices";

    @objid ("e61e522a-96e5-429c-937d-05a7884a0c59")
    public static final String HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE = "HwComponent_Attribute_price";

    @objid ("4b1823f1-8359-4402-ade5-7f01e3f19f15")
    public static final String HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE = "HwComponent_Attribute_r_Conditions";

    @objid ("9b6365ce-d6ac-46cb-b51b-0ec78aa7c10c")
    public static final String HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE = "HwComponent_Attribute_staticConsumption";

    @objid ("68a884dd-0001-4513-b857-8ba6838f52dd")
    public static final String HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE = "HwComponent_Attribute_staticDissipation";

    @objid ("df97b7ed-b85e-4e84-a284-49152aca61d6")
    public static final String HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE = "HwComponent_Attribute_subComponents";

    @objid ("3498dc30-0157-4882-b266-7dcb9e1e8ca4")
    public static final String HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE = "HwComponent_Attribute_weight";

    /**
     * Tells whether a {@link HwComponentAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwComponent_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f1e61804-c374-4246-8e91-09622e7ab1eb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwComponent_Attribute >> then instantiate a {@link HwComponentAttribute} proxy.
     * 
     * @return a {@link HwComponentAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("a6dcb7e7-c712-4ab3-a83f-c2290226e4e5")
    public static HwComponentAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAttribute.STEREOTYPE_NAME);
        return HwComponentAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentAttribute} proxy from a {@link Attribute} stereotyped << HwComponent_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwComponentAttribute} proxy or <i>null</i>.
     */
    @objid ("7eeca638-3372-4caf-aa47-24a849034b60")
    public static HwComponentAttribute instantiate(final Attribute obj) {
        return HwComponentAttribute.canInstantiate(obj) ? new HwComponentAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentAttribute} proxy from a {@link Attribute} stereotyped << HwComponent_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwComponentAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4f22188e-7bd0-4dfc-a097-9328438f5697")
    public static HwComponentAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwComponentAttribute.canInstantiate(obj))
        	return new HwComponentAttribute(obj);
        else
        	throw new IllegalArgumentException("HwComponentAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d8ebc3e-5f14-41cd-a52d-31196e604a78")
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
        HwComponentAttribute other = (HwComponentAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("ee34564d-8239-4bfa-a211-347a27b09c4b")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Attribute_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ca76d61-fe2b-4c11-84a5-f4cd232dbb84")
    public String getHwComponent_Attribute_area() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0b82e82a-a19b-4b19-a6f7-39d110084790")
    public List<String> getHwComponent_Attribute_dimensions() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0cc51066-5996-481b-a32d-b682826c75bc")
    public List<String> getHwComponent_Attribute_grid() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d90680ca-4706-465e-9fcb-47829bc057b6")
    public String getHwComponent_Attribute_kind() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7830e41-f6e2-4baf-8f09-a63a57c91160")
    public String getHwComponent_Attribute_nbPins() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("02805979-94b4-4f16-a004-92ae67c73074")
    public List<String> getHwComponent_Attribute_position() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ffedb7d9-dd67-42c4-9baa-3edd743f3000")
    public List<String> getHwComponent_Attribute_poweredServices() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f6fbe99-60d4-43ce-b0f9-607ace63b46b")
    public String getHwComponent_Attribute_price() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("550a6be5-7968-4d53-9e0d-a43069a7359c")
    public List<String> getHwComponent_Attribute_r_Conditions() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afa7a797-9771-4102-af51-d66113433c77")
    public String getHwComponent_Attribute_staticConsumption() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1132d22b-a89b-49e0-bf35-51667f4eefe8")
    public String getHwComponent_Attribute_staticDissipation() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ef2b2f49-51ee-47c3-b560-fd6740d5e3f0")
    public List<String> getHwComponent_Attribute_subComponents() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85ed1882-4041-4893-aed6-c386071f3d76")
    public String getHwComponent_Attribute_weight() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("5d2877dd-fe1b-4cb6-a74a-e59065a4bfe9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Attribute_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("542408ed-6ee6-4b4d-9cd3-75b354022628")
    public void setHwComponent_Attribute_area(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f24a41ef-ebfc-4a58-8c8e-3ec3e3e62083")
    public void setHwComponent_Attribute_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acfab02b-47f0-40ea-9408-d48dc9596dc6")
    public void setHwComponent_Attribute_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("327b3078-8e00-4cfb-96e7-ef4ba42be340")
    public void setHwComponent_Attribute_kind(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6e401b2-2cc4-40b5-b6b5-7252821bd778")
    public void setHwComponent_Attribute_nbPins(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72acddb7-9a9d-4ef2-a641-d8346f329b2b")
    public void setHwComponent_Attribute_position(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8c83720-30c5-4730-a157-82376a4193d2")
    public void setHwComponent_Attribute_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("25fbb922-50d7-43d3-96d3-eb84b91bc8f2")
    public void setHwComponent_Attribute_price(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e268608-6b3b-41a7-8261-18d5414564fe")
    public void setHwComponent_Attribute_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f46dfbd-e6ce-48a4-a7fb-57c660dc1627")
    public void setHwComponent_Attribute_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("432e665f-1e80-42a5-bc07-98be42f498cb")
    public void setHwComponent_Attribute_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a903f6cf-cdfe-40c5-925a-84fb51537724")
    public void setHwComponent_Attribute_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1579e7c1-e569-4438-b003-75c8933202c9")
    public void setHwComponent_Attribute_weight(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("f0a99bf9-aaea-4e76-8cd4-3dfd6dd1f105")
    protected HwComponentAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("44880b09-1bd1-4307-8fa8-9e770e3ea7ca")
    public static final class MdaTypes {
        @objid ("279c2ea7-b6f8-4b3e-b2e9-b43f8660b553")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("40efbd71-4297-476c-8399-328ac7a5a010")
        public static TagType HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT;

        @objid ("63388a60-eeb9-4e0b-b42b-08473f243d71")
        public static TagType HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT;

        @objid ("f30ed9ad-f0b1-4079-9e97-65fee2f7b588")
        public static TagType HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT;

        @objid ("682842c5-1e46-4dc6-a78b-aa5e69dc0480")
        public static TagType HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT;

        @objid ("71e07c0f-26e9-431b-99fb-02c20dc6a774")
        public static TagType HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT;

        @objid ("56bba314-11cb-4ca3-acc8-2e4cca956ad3")
        public static TagType HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT;

        @objid ("805ff973-fc5d-4f85-90dc-53775cd3c81a")
        public static TagType HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT;

        @objid ("752fae5b-a9e3-46d9-bf8d-c08308c3531c")
        public static TagType HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT;

        @objid ("61660fe9-b73d-4138-a96f-0ae8eec65cad")
        public static TagType HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("9ddcea5d-958c-46a4-ba0c-4cf60ec9f4d4")
        public static TagType HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("12dd0b6a-e0cd-4c42-85c2-4f0152be3bcb")
        public static TagType HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("8ed8a499-2075-4b7a-9a9b-607be812e86b")
        public static TagType HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("e1eb8a53-4ea2-47f4-825a-f822d5337632")
        public static TagType HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("eeece40b-1fd1-4fcd-8f8c-aa2750da3074")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca193e04-d3df-4e46-801b-21d4d1aa446c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2fa627d4-6021-4287-92ea-106316c20837")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0188ecd8-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ecdf-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece6-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f28-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f2f-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f36-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f3d-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f44-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f4b-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f52-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db17b-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db182-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db189-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db190-0ccf-11df-8525-001302895b2b");
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
