/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.MutualExclusionResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SaSharedResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaSharedResourceLifeline extends MutualExclusionResourceLifeline {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Lifeline";

    public static final String SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE = "SaSharedResource_Lifeline_acquisT";

    public static final String SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE = "SaSharedResource_Lifeline_capacity";

    public static final String SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE = "SaSharedResource_Lifeline_isConsum";

    public static final String SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE = "SaSharedResource_Lifeline_isPreemp";

    public static final String SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE = "SaSharedResource_Lifeline_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SaSharedResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SaSharedResource_Lifeline >> then instantiate a {@link SaSharedResourceLifeline} proxy.
     * 
     * @return a {@link SaSharedResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SaSharedResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLifeline.STEREOTYPE_NAME);
        return SaSharedResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLifeline} proxy from a {@link Lifeline} stereotyped << SaSharedResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SaSharedResourceLifeline} proxy or <i>null</i>.
     */
    public static SaSharedResourceLifeline instantiate(final Lifeline obj) {
        return SaSharedResourceLifeline.canInstantiate(obj) ? new SaSharedResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLifeline} proxy from a {@link Lifeline} stereotyped << SaSharedResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SaSharedResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaSharedResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SaSharedResourceLifeline.canInstantiate(obj))
        	return new SaSharedResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceLifeline other = (SaSharedResourceLifeline) obj;
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
     * Getter for List<String> property 'SaSharedResource_Lifeline_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Lifeline_acquisT() {
        return this.elt.getTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Lifeline_capacity() {
        return this.elt.getTagValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Lifeline_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Lifeline_releaseT() {
        return this.elt.getTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Lifeline_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Lifeline_isConsum() {
        return this.elt.isTagged(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Lifeline_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Lifeline_isPreemp() {
        return this.elt.isTagged(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Lifeline_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Lifeline_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Lifeline_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Lifeline_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Lifeline_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Lifeline_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Lifeline_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Lifeline_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Lifeline_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLifeline.MdaTypes.SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "782f4c07-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0a-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0b-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0c-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c0d-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_LIFELINE_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "782f4c08-14ad-11df-9d54-0014222a9f79");
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
