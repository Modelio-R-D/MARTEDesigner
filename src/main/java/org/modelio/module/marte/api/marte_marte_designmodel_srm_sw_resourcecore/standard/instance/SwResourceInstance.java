/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwResourceInstance {
    public static final String STEREOTYPE_NAME = "SwResource_Instance";

    public static final String SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE = "SwResource_Instance_createServices";

    public static final String SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE = "SwResource_Instance_deleteServices";

    public static final String SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Instance_identifierElements";

    public static final String SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE = "SwResource_Instance_initializeServices";

    public static final String SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Instance_memorySizeFootprint";

    public static final String SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE = "SwResource_Instance_stateElements";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    protected final Instance elt;

    /**
     * Tells whether a {@link SwResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwResource_Instance >> then instantiate a {@link SwResourceInstance} proxy.
     * 
     * @return a {@link SwResourceInstance} proxy on the created {@link Instance}.
     */
    public static SwResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceInstance.STEREOTYPE_NAME);
        return SwResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceInstance} proxy from a {@link Instance} stereotyped << SwResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwResourceInstance} proxy or <i>null</i>.
     */
    public static SwResourceInstance instantiate(final Instance obj) {
        return SwResourceInstance.canInstantiate(obj) ? new SwResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceInstance} proxy from a {@link Instance} stereotyped << SwResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwResourceInstance.canInstantiate(obj))
        	return new SwResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceInstance other = (SwResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Instance_createServices() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Instance_deleteServices() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Instance_identifierElements() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Instance_initializeServices() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Instance_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Instance_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Instance_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Instance_stateElements() {
        return this.elt.getTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Instance_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Instance_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Instance_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Instance_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Instance_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Instance_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Instance_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Instance_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceInstance.MdaTypes.SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a32661-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32668-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266f-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588af-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b6-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588bd-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_INSTANCE_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588c4-0ccf-11df-8525-001302895b2b");
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
