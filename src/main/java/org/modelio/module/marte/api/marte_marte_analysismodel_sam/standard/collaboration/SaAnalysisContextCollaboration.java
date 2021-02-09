/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.collaboration;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.collaboration.GaAnalysisContextCollaboration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << SaAnalysisContext_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaAnalysisContextCollaboration extends GaAnalysisContextCollaboration {
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Collaboration";

    public static final String SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE = "SaAnalysisContext_Collaboration_isSched";

    public static final String SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Collaboration_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >> then instantiate a {@link SaAnalysisContextCollaboration} proxy.
     * 
     * @return a {@link SaAnalysisContextCollaboration} proxy on the created {@link Collaboration}.
     */
    public static SaAnalysisContextCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextCollaboration.STEREOTYPE_NAME);
        return SaAnalysisContextCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextCollaboration} proxy from a {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link SaAnalysisContextCollaboration} proxy or <i>null</i>.
     */
    public static SaAnalysisContextCollaboration instantiate(final Collaboration obj) {
        return SaAnalysisContextCollaboration.canInstantiate(obj) ? new SaAnalysisContextCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextCollaboration} proxy from a {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link SaAnalysisContextCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaAnalysisContextCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (SaAnalysisContextCollaboration.canInstantiate(obj))
        	return new SaAnalysisContextCollaboration(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaAnalysisContextCollaboration other = (SaAnalysisContextCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Collaboration_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaAnalysisContext_Collaboration_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Collaboration_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaAnalysisContext_Collaboration_isSched() {
        return this.elt.isTagged(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Collaboration_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Collaboration_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaAnalysisContext_Collaboration_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Collaboration_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT, value);
    }

    protected SaAnalysisContextCollaboration(final Collaboration elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0384bb10-0ccf-11df-8525-001302895b2b");
            SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb12-0ccf-11df-8525-001302895b2b");
            SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb14-0ccf-11df-8525-001302895b2b");
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
