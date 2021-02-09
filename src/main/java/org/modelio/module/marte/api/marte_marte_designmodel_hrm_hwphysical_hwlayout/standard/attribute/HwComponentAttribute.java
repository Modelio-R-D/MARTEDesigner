/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwComponentAttribute extends HwResourceAttribute {
    public static final String STEREOTYPE_NAME = "HwComponent_Attribute";

    public static final String HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE = "HwComponent_Attribute_area";

    public static final String HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE = "HwComponent_Attribute_dimensions";

    public static final String HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE = "HwComponent_Attribute_grid";

    public static final String HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE = "HwComponent_Attribute_kind";

    public static final String HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE = "HwComponent_Attribute_nbPins";

    public static final String HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE = "HwComponent_Attribute_position";

    public static final String HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE = "HwComponent_Attribute_poweredServices";

    public static final String HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE = "HwComponent_Attribute_price";

    public static final String HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE = "HwComponent_Attribute_r_Conditions";

    public static final String HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE = "HwComponent_Attribute_staticConsumption";

    public static final String HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE = "HwComponent_Attribute_staticDissipation";

    public static final String HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE = "HwComponent_Attribute_subComponents";

    public static final String HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE = "HwComponent_Attribute_weight";

    /**
     * Tells whether a {@link HwComponentAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwComponent_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwComponent_Attribute >> then instantiate a {@link HwComponentAttribute} proxy.
     * 
     * @return a {@link HwComponentAttribute} proxy on the created {@link Attribute}.
     */
    public static HwComponentAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAttribute.STEREOTYPE_NAME);
        return HwComponentAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentAttribute} proxy from a {@link Attribute} stereotyped << HwComponent_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwComponentAttribute} proxy or <i>null</i>.
     */
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
    public static HwComponentAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwComponentAttribute.canInstantiate(obj))
        	return new HwComponentAttribute(obj);
        else
        	throw new IllegalArgumentException("HwComponentAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Attribute_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_area() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Attribute_dimensions() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Attribute_grid() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_kind() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_nbPins() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Attribute_position() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Attribute_poweredServices() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_price() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Attribute_r_Conditions() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_staticConsumption() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_staticDissipation() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Attribute_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Attribute_subComponents() {
        return this.elt.getTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Attribute_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Attribute_weight() {
        return this.elt.getTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Attribute_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_area(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_kind(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_nbPins(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_position(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_price(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Attribute_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Attribute_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Attribute_weight(final String value) {
        this.elt.putTagValue(HwComponentAttribute.MdaTypes.HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
