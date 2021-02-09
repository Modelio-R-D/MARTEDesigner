/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.parameter;

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
public class HwComponentParameter extends HwResourceParameter {
    public static final String STEREOTYPE_NAME = "HwComponent_Parameter";

    public static final String HWCOMPONENT_PARAMETER_AREA_TAGTYPE = "HwComponent_Parameter_area";

    public static final String HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE = "HwComponent_Parameter_dimensions";

    public static final String HWCOMPONENT_PARAMETER_GRID_TAGTYPE = "HwComponent_Parameter_grid";

    public static final String HWCOMPONENT_PARAMETER_KIND_TAGTYPE = "HwComponent_Parameter_kind";

    public static final String HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE = "HwComponent_Parameter_nbPins";

    public static final String HWCOMPONENT_PARAMETER_POSITION_TAGTYPE = "HwComponent_Parameter_position";

    public static final String HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE = "HwComponent_Parameter_poweredServices";

    public static final String HWCOMPONENT_PARAMETER_PRICE_TAGTYPE = "HwComponent_Parameter_price";

    public static final String HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE = "HwComponent_Parameter_r_Conditions";

    public static final String HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE = "HwComponent_Parameter_staticConsumption";

    public static final String HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE = "HwComponent_Parameter_staticDissipation";

    public static final String HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE = "HwComponent_Parameter_subComponents";

    public static final String HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE = "HwComponent_Parameter_weight";

    /**
     * Tells whether a {@link HwComponentParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwComponent_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwComponent_Parameter >> then instantiate a {@link HwComponentParameter} proxy.
     * 
     * @return a {@link HwComponentParameter} proxy on the created {@link Parameter}.
     */
    public static HwComponentParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentParameter.STEREOTYPE_NAME);
        return HwComponentParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentParameter} proxy from a {@link Parameter} stereotyped << HwComponent_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwComponentParameter} proxy or <i>null</i>.
     */
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
    public static HwComponentParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwComponentParameter.canInstantiate(obj))
        	return new HwComponentParameter(obj);
        else
        	throw new IllegalArgumentException("HwComponentParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComponentParameter other = (HwComponentParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Parameter_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_area() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Parameter_dimensions() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Parameter_grid() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_kind() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_nbPins() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Parameter_position() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Parameter_poweredServices() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_price() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Parameter_r_Conditions() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_staticConsumption() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_staticDissipation() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Parameter_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Parameter_subComponents() {
        return this.elt.getTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Parameter_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Parameter_weight() {
        return this.elt.getTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Parameter_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_area(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_kind(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_nbPins(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_position(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_price(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Parameter_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Parameter_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Parameter_weight(final String value) {
        this.elt.putTagValue(HwComponentParameter.MdaTypes.HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_PARAMETER_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
