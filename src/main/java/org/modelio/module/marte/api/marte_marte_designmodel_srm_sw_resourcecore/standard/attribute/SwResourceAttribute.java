/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwResourceAttribute extends ResourceAttribute {
    public static final String STEREOTYPE_NAME = "SwResource_Attribute";

    public static final String SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE = "SwResource_Attribute_createServices";

    public static final String SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE = "SwResource_Attribute_deleteServices";

    public static final String SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Attribute_identifierElements";

    public static final String SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE = "SwResource_Attribute_initializeServices";

    public static final String SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Attribute_memorySizeFootprint";

    public static final String SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE = "SwResource_Attribute_stateElements";

    /**
     * Tells whether a {@link SwResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwResource_Attribute >> then instantiate a {@link SwResourceAttribute} proxy.
     * 
     * @return a {@link SwResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static SwResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAttribute.STEREOTYPE_NAME);
        return SwResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAttribute} proxy from a {@link Attribute} stereotyped << SwResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwResourceAttribute} proxy or <i>null</i>.
     */
    public static SwResourceAttribute instantiate(final Attribute obj) {
        return SwResourceAttribute.canInstantiate(obj) ? new SwResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceAttribute} proxy from a {@link Attribute} stereotyped << SwResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwResourceAttribute.canInstantiate(obj))
        	return new SwResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceAttribute other = (SwResourceAttribute) obj;
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
     * Getter for List<String> property 'SwResource_Attribute_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Attribute_createServices() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Attribute_deleteServices() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Attribute_identifierElements() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Attribute_initializeServices() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Attribute_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Attribute_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Attribute_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Attribute_stateElements() {
        return this.elt.getTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Attribute_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Attribute_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Attribute_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Attribute_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Attribute_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Attribute_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Attribute_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Attribute_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAttribute.MdaTypes.SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a3265e-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32665-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266c-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32673-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b3-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588ba-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ATTRIBUTE_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588c1-0ccf-11df-8525-001302895b2b");
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
