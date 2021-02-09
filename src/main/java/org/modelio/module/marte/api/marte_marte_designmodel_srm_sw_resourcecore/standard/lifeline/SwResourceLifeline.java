/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwResourceLifeline extends ResourceLifeline {
    public static final String STEREOTYPE_NAME = "SwResource_Lifeline";

    public static final String SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE = "SwResource_Lifeline_createServices";

    public static final String SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE = "SwResource_Lifeline_deleteServices";

    public static final String SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Lifeline_identifierElements";

    public static final String SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE = "SwResource_Lifeline_initializeServices";

    public static final String SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Lifeline_memorySizeFootprint";

    public static final String SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE = "SwResource_Lifeline_stateElements";

    /**
     * Tells whether a {@link SwResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwResource_Lifeline >> then instantiate a {@link SwResourceLifeline} proxy.
     * 
     * @return a {@link SwResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SwResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLifeline.STEREOTYPE_NAME);
        return SwResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwResourceLifeline} proxy or <i>null</i>.
     */
    public static SwResourceLifeline instantiate(final Lifeline obj) {
        return SwResourceLifeline.canInstantiate(obj) ? new SwResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwResourceLifeline.canInstantiate(obj))
        	return new SwResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceLifeline other = (SwResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Lifeline_createServices() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Lifeline_deleteServices() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Lifeline_identifierElements() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Lifeline_initializeServices() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Lifeline_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Lifeline_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Lifeline_stateElements() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Lifeline_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Lifeline_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Lifeline_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Lifeline_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Lifeline_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Lifeline_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Lifeline_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3e7983a2-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be601-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be602-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7983a3-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7983a4-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be5ff-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be600-10c0-11df-81d9-0014222a9f79");
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
