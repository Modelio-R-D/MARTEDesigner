/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.node;

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
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.node.GaAnalysisContextNode;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Node} with << SaAnalysisContext_Node >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaAnalysisContextNode extends GaAnalysisContextNode {
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Node";

    public static final String SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE = "SaAnalysisContext_Node_isSched";

    public static final String SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Node_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextNode proxy} can be instantiated from a {@link MObject} checking it is a {@link Node} stereotyped << SaAnalysisContext_Node >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Node) && ((Node) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextNode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Node} stereotyped << SaAnalysisContext_Node >> then instantiate a {@link SaAnalysisContextNode} proxy.
     * 
     * @return a {@link SaAnalysisContextNode} proxy on the created {@link Node}.
     */
    public static SaAnalysisContextNode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Node");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextNode.STEREOTYPE_NAME);
        return SaAnalysisContextNode.instantiate((Node)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextNode} proxy from a {@link Node} stereotyped << SaAnalysisContext_Node >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Node
     * @return a {@link SaAnalysisContextNode} proxy or <i>null</i>.
     */
    public static SaAnalysisContextNode instantiate(final Node obj) {
        return SaAnalysisContextNode.canInstantiate(obj) ? new SaAnalysisContextNode(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextNode} proxy from a {@link Node} stereotyped << SaAnalysisContext_Node >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Node}
     * @return a {@link SaAnalysisContextNode} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaAnalysisContextNode safeInstantiate(final Node obj) throws IllegalArgumentException {
        if (SaAnalysisContextNode.canInstantiate(obj))
        	return new SaAnalysisContextNode(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextNode: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaAnalysisContextNode other = (SaAnalysisContextNode) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Node}. 
     * @return the Node represented by this proxy, never null.
     */
    @Override
    public Node getElement() {
        return (Node)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Node_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaAnalysisContext_Node_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Node_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaAnalysisContext_Node_isSched() {
        return this.elt.isTagged(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Node_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Node_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaAnalysisContext_Node_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Node_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT, value);
    }

    protected SaAnalysisContextNode(final Node elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8367384b-14ab-11df-9d54-0014222a9f79");
            SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8367384c-14ab-11df-9d54-0014222a9f79");
            SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8367384d-14ab-11df-9d54-0014222a9f79");
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
