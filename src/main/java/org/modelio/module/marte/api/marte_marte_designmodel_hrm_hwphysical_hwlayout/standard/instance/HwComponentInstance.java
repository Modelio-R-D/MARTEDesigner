/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.instance;

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
@objid ("86ecf9b7-3baa-411a-9666-159b04d061fd")
public class HwComponentInstance extends HwResourceInstance {
    @objid ("9554c72d-4b99-446e-b871-6620edf79164")
    public static final String STEREOTYPE_NAME = "HwComponent_Instance";

    @objid ("45878c6e-6fd4-4c0f-9b78-4ddf82591620")
    public static final String HWCOMPONENT_INSTANCE_AREA_TAGTYPE = "HwComponent_Instance_area";

    @objid ("850e45b9-1bcd-44e4-89cf-edd101f12c3a")
    public static final String HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE = "HwComponent_Instance_dimensions";

    @objid ("69773a69-bfd4-4321-85ed-528ed0150dd6")
    public static final String HWCOMPONENT_INSTANCE_GRID_TAGTYPE = "HwComponent_Instance_grid";

    @objid ("027a22b7-d0b7-4a6d-a4c9-298c329656a3")
    public static final String HWCOMPONENT_INSTANCE_KIND_TAGTYPE = "HwComponent_Instance_kind";

    @objid ("6fbd3f51-dc08-4ac8-9f02-e4a008a8bf6d")
    public static final String HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE = "HwComponent_Instance_nbPins";

    @objid ("baa7c16e-a37d-496c-9775-64945a424307")
    public static final String HWCOMPONENT_INSTANCE_POSITION_TAGTYPE = "HwComponent_Instance_position";

    @objid ("461500eb-83bc-4446-92df-0b0e9aa650e1")
    public static final String HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE = "HwComponent_Instance_poweredServices";

    @objid ("14738676-7fa4-4d8a-a06c-d4cdc61d3e6a")
    public static final String HWCOMPONENT_INSTANCE_PRICE_TAGTYPE = "HwComponent_Instance_price";

    @objid ("c73f4f6c-a4ae-4aec-8994-1a9a203a5ee5")
    public static final String HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE = "HwComponent_Instance_r_Conditions";

    @objid ("6e89ef1a-60f7-4117-8d90-56b91d4917ae")
    public static final String HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE = "HwComponent_Instance_staticConsumption";

    @objid ("8cae863d-8688-4115-8a77-317e566260ff")
    public static final String HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE = "HwComponent_Instance_staticDissipation";

    @objid ("6f62eeec-c85d-409e-9257-51305b2c9380")
    public static final String HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE = "HwComponent_Instance_subComponents";

    @objid ("85340495-92b3-4d0f-8fee-3deee4c022b1")
    public static final String HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE = "HwComponent_Instance_weight";

    /**
     * Tells whether a {@link HwComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwComponent_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b4a36049-be24-4420-94e5-bcdcf25c809c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwComponent_Instance >> then instantiate a {@link HwComponentInstance} proxy.
     * 
     * @return a {@link HwComponentInstance} proxy on the created {@link Instance}.
     */
    @objid ("c9603fe7-fb1a-4ea3-a7a2-55394eec990f")
    public static HwComponentInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentInstance.STEREOTYPE_NAME);
        return HwComponentInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentInstance} proxy from a {@link Instance} stereotyped << HwComponent_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwComponentInstance} proxy or <i>null</i>.
     */
    @objid ("5632e87e-ddf7-46a0-95f8-26528663c02d")
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
    @objid ("07650ccd-68b3-405a-8872-e9ec1bd7094a")
    public static HwComponentInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwComponentInstance.canInstantiate(obj))
        	return new HwComponentInstance(obj);
        else
        	throw new IllegalArgumentException("HwComponentInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc2dc462-f014-4494-a355-51a269d22963")
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
    @objid ("e7afd3c6-283d-4247-811e-bb1a850db7c0")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Instance_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3cceeef-a8af-4f22-a2bd-140ea352d47c")
    public String getHwComponent_Instance_area() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7d17bc70-a5be-4b58-b0c8-082ebef2cb8b")
    public List<String> getHwComponent_Instance_dimensions() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("abb3eb59-14de-453e-a940-289fb8195cb6")
    public List<String> getHwComponent_Instance_grid() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8572750-dc0c-4449-abbc-38564ed3c0fd")
    public String getHwComponent_Instance_kind() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ada7936-61da-44d4-864b-3bc46d0ec8ae")
    public String getHwComponent_Instance_nbPins() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("317ef1d0-7790-4da7-b3c4-31461e5e7260")
    public List<String> getHwComponent_Instance_position() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9fe325f3-e41b-4d4a-a5d2-0c3ab4396d91")
    public List<String> getHwComponent_Instance_poweredServices() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0bfbba6-d169-4763-946d-8e62827436b9")
    public String getHwComponent_Instance_price() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9ca4663f-4b3a-4243-b026-bed5b47f80a3")
    public List<String> getHwComponent_Instance_r_Conditions() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70d6b186-4905-473f-8337-6796c778808d")
    public String getHwComponent_Instance_staticConsumption() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e9d9236-f377-43bb-86c9-4365adedf2b8")
    public String getHwComponent_Instance_staticDissipation() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Instance_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd4e5441-da8d-47d0-91c5-579a89a0ea9c")
    public List<String> getHwComponent_Instance_subComponents() {
        return this.elt.getTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Instance_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ed61d9e-4149-495f-8dfa-c5d1b3030650")
    public String getHwComponent_Instance_weight() {
        return this.elt.getTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("1093cd62-3532-4091-8fe2-2a36749a6588")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Instance_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a335c1b6-fa7a-4e1c-ad87-7e4ffa4e8c1b")
    public void setHwComponent_Instance_area(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06b20b7c-ef1c-46ee-b2e3-259513110386")
    public void setHwComponent_Instance_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ac29180-0d64-4b72-b209-a10278488eb1")
    public void setHwComponent_Instance_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f4c2df6-3791-410c-8436-bd239f17f888")
    public void setHwComponent_Instance_kind(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Instance_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3880d1a0-63bc-49b0-9925-f8545c75a894")
    public void setHwComponent_Instance_nbPins(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("691724d7-5a84-41b9-9aed-cc811aa7c354")
    public void setHwComponent_Instance_position(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18029df0-18d3-418c-a0a0-c60db9e20209")
    public void setHwComponent_Instance_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("520ecedc-467f-44ea-951a-50a3e17be13a")
    public void setHwComponent_Instance_price(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34567890-6262-4cd6-a202-151f661d1fca")
    public void setHwComponent_Instance_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db4997ad-c387-41f1-98b6-24f0a4d11f88")
    public void setHwComponent_Instance_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Instance_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4265b6ad-5b72-4eb0-8d54-a08ee7553fa8")
    public void setHwComponent_Instance_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Instance_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67734997-c9a9-4c8f-b04e-3b3c70d6f00a")
    public void setHwComponent_Instance_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Instance_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82eecfa1-a45a-4bca-869a-894a4fb91753")
    public void setHwComponent_Instance_weight(final String value) {
        this.elt.putTagValue(HwComponentInstance.MdaTypes.HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("aefa868a-976d-4de4-ba9b-041704d3ce08")
    protected HwComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("67102e41-f413-4f5e-9ba9-c94872ba6c29")
    public static final class MdaTypes {
        @objid ("dc9a6869-e481-40bb-b496-1a71dc04399f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a1828b9-8004-4ab1-8e26-15cbb9263105")
        public static TagType HWCOMPONENT_INSTANCE_KIND_TAGTYPE_ELT;

        @objid ("b4f3a51a-2829-41f9-b0e5-67f48dc91f27")
        public static TagType HWCOMPONENT_INSTANCE_DIMENSIONS_TAGTYPE_ELT;

        @objid ("060871d4-d039-4e41-9c68-918dbbb682f6")
        public static TagType HWCOMPONENT_INSTANCE_AREA_TAGTYPE_ELT;

        @objid ("f29c64cb-47b8-4189-9956-ed55651cdc19")
        public static TagType HWCOMPONENT_INSTANCE_POSITION_TAGTYPE_ELT;

        @objid ("88f88c85-bacd-4e30-be37-5587007a59b6")
        public static TagType HWCOMPONENT_INSTANCE_GRID_TAGTYPE_ELT;

        @objid ("8670b20f-38bc-482c-9c68-595f760efa97")
        public static TagType HWCOMPONENT_INSTANCE_NBPINS_TAGTYPE_ELT;

        @objid ("3ccd25c8-f046-4c82-b172-2844b0e4b546")
        public static TagType HWCOMPONENT_INSTANCE_WEIGHT_TAGTYPE_ELT;

        @objid ("e4691806-cc81-455c-a733-9f5aa1f04850")
        public static TagType HWCOMPONENT_INSTANCE_PRICE_TAGTYPE_ELT;

        @objid ("282b590f-e118-451f-8d65-b0797b44e29f")
        public static TagType HWCOMPONENT_INSTANCE_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("ca11691c-a180-4558-9905-4beda376f832")
        public static TagType HWCOMPONENT_INSTANCE_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("ec384ce6-5116-4b37-be23-128843f532d1")
        public static TagType HWCOMPONENT_INSTANCE_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("b9cb9c1b-661f-409a-9133-c37f0b152640")
        public static TagType HWCOMPONENT_INSTANCE_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("eaef2c2c-8fd0-46a7-b6d4-2a04d16429ff")
        public static TagType HWCOMPONENT_INSTANCE_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("08752a4c-844c-444e-8e1c-051895151e74")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3ba3708-e603-4d8a-a43f-0f020c36db5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("743c1ad4-e033-45ae-abaa-39979a1f5669")
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
