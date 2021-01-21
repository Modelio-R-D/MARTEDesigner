/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.collaboration;

import java.util.ArrayList;
import java.util.Collections;
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
@objid ("f99e9253-cc12-46ad-a0b3-80d0dcc9cba8")
public class SaAnalysisContextCollaboration extends GaAnalysisContextCollaboration {
    @objid ("201a45c2-b6b2-46e4-8e7c-72418523256e")
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Collaboration";

    @objid ("c73249ad-231c-4dfc-813b-c5f45890eef7")
    public static final String SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE = "SaAnalysisContext_Collaboration_isSched";

    @objid ("bf45de7e-c092-4970-854e-210dcc88484a")
    public static final String SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Collaboration_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a779a5dc-8c57-408e-b93f-0fe0ff1c67a5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >> then instantiate a {@link SaAnalysisContextCollaboration} proxy.
     * 
     * @return a {@link SaAnalysisContextCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("598e75c0-185f-427d-8b43-6954d0e1d979")
    public static SaAnalysisContextCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextCollaboration.STEREOTYPE_NAME);
        return SaAnalysisContextCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextCollaboration} proxy from a {@link Collaboration} stereotyped << SaAnalysisContext_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link SaAnalysisContextCollaboration} proxy or <i>null</i>.
     */
    @objid ("3db5776f-1803-41af-b0c0-f1ff49f12fb4")
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
    @objid ("c9bc2cc0-d580-4a98-9604-eb7aa6857304")
    public static SaAnalysisContextCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (SaAnalysisContextCollaboration.canInstantiate(obj))
        	return new SaAnalysisContextCollaboration(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0b844581-79a9-4ec6-8082-4e81c596b44f")
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
    @objid ("681703ab-d655-4fa2-b4d3-d71a3f09c683")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Collaboration_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6443ac5d-9ad7-41b3-a44b-c18f17552770")
    public String getSaAnalysisContext_Collaboration_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT);
    }

    @objid ("e8606b0c-0118-405b-abb8-a56af16525ce")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Collaboration_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb926ad4-bb06-4f1b-8279-47604d3571d6")
    public boolean isSaAnalysisContext_Collaboration_isSched() {
        return this.elt.isTagged(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Collaboration_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69d84fbf-cf2f-4fd5-b5f2-715dcad59876")
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
    @objid ("9364e252-91b4-443d-93f3-4fa788e60b77")
    public void setSaAnalysisContext_Collaboration_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextCollaboration.MdaTypes.SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT, value);
    }

    @objid ("68215b97-d66a-4486-9af5-7d584c33065c")
    protected SaAnalysisContextCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("6cdf0895-4c13-48a2-a411-946838397b1a")
    public static final class MdaTypes {
        @objid ("9a0efa70-75a8-492c-97cf-9ddb0d75880c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88d008a7-4d8b-4a40-b1c7-6c201b4a3cb0")
        public static TagType SAANALYSISCONTEXT_COLLABORATION_ISSCHED_TAGTYPE_ELT;

        @objid ("715f2eb3-4366-4658-b00e-713dd204d23c")
        public static TagType SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION_TAGTYPE_ELT;

        @objid ("fd39bd44-0782-45a4-a01f-9dc11a9287da")
        private static Stereotype MDAASSOCDEP;

        @objid ("8776e438-1a2a-443e-8df8-dda36ed59647")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1201a22-230e-44f7-912f-faaeee6e9163")
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
