/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwComponent_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComponentInstance extends HwResourceInstance {
    public static final String STEREOTYPE_NAME = "HwComponent_Instance";

    public static final String HWCOMPONENT_INSTANCE_AREA_TAGTYPE = "HwComponent_Instance_area";

    public static final String HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE = "HwComponent_Instance_dimensions";

    public static final String HWCOMPONENT_INSTANCE_GRID_TAGTYPE = "HwComponent_Instance_grid";

    public static final String HWCOMPONENT_INSTANCE_KIND_TAGTYPE = "HwComponent_Instance_kind";

    public static final String HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE = "HwComponent_Instance_nbPins";

    public static final String HWCOMPONENT_INSTANCE_POSITION_TAGTYPE = "HwComponent_Instance_position";

    public static final String HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE = "HwComponent_Instance_poweredServices";

    public static final String HWCOMPONENT_INSTANCE_PRICE_TAGTYPE = "HwComponent_Instance_price";

    public static final String HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE = "HwComponent_Instance_r_Conditions";

    public static final String HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE = "HwComponent_Instance_staticConsumption";

    public static final String HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE = "HwComponent_Instance_staticDissipation";

    public static final String HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE = "HwComponent_Instance_subComponents";

    public static final String HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE = "HwComponent_Instance_weight";

    /**
     * Tells whether a {@link HwComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwComponent_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwComponent_Instance >> then instantiate a {@link HwComponentInstance} proxy.
     * 
     * @return a {@link HwComponentInstance} proxy on the created {@link Instance}.
     */
    public static HwComponentInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentInstance.STEREOTYPE_NAME);
        return HwComponentInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentInstance} proxy from a {@link Instance} stereotyped << HwComponent_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwComponentInstance} proxy or <i>null</i>.
     */
    public static HwComponentInstance instantiate(final Instance obj) {
        return HwComponentInstance.canInstantiate(obj) ? new HwComponentInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentInstance} proxy from a {@link Instance} stereotyped << HwComponent_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwComponentInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComponentInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwComponentInstance.canInstantiate(obj))
        	return new HwComponentInstance(obj);
        else
        	throw new IllegalArgumentException("HwComponentInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComponentInstance other = (HwComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Instance_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_area() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Instance_dimensions() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Instance_grid() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_kind() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_nbPins() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Instance_position() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Instance_poweredServices() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_price() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Instance_r_Conditions() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_staticConsumption() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_staticDissipation() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Instance_subComponents() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Instance_weight() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Instance_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_area(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_kind(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Instance_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_nbPins(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_position(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_price(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Instance_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Instance_weight(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0188ecdb-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece2-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece9-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f2b-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f32-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f39-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f40-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f47-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f4e-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f55-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db17e-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db185-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db18c-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db193-0ccf-11df-8525-001302895b2b");
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
