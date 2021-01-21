/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.node;

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
@objid ("0a6ebecd-04a0-4682-bd48-9979553aa5c8")
public class SaAnalysisContextNode extends GaAnalysisContextNode {
    @objid ("be7d3b9e-cbf5-457f-95e1-9be8ee06983d")
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Node";

    @objid ("88f462b6-7ad3-4da9-89ee-7b2a3738381f")
    public static final String SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE = "SaAnalysisContext_Node_isSched";

    @objid ("1afd365e-347a-4d23-90a0-81ffc2135e28")
    public static final String SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Node_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextNode proxy} can be instantiated from a {@link MObject} checking it is a {@link Node} stereotyped << SaAnalysisContext_Node >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b5fd31b1-9837-4df4-980f-55a91d75ac8c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Node) && ((Node) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextNode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Node} stereotyped << SaAnalysisContext_Node >> then instantiate a {@link SaAnalysisContextNode} proxy.
     * 
     * @return a {@link SaAnalysisContextNode} proxy on the created {@link Node}.
     */
    @objid ("70f5e919-0496-413b-9a6e-2bea984a6752")
    public static SaAnalysisContextNode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Node");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextNode.STEREOTYPE_NAME);
        return SaAnalysisContextNode.instantiate((Node)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextNode} proxy from a {@link Node} stereotyped << SaAnalysisContext_Node >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Node
     * @return a {@link SaAnalysisContextNode} proxy or <i>null</i>.
     */
    @objid ("14791823-efac-4d3c-9590-3c204441874e")
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
    @objid ("beb05ae6-f356-434f-b817-ae1f2e8f25cd")
    public static SaAnalysisContextNode safeInstantiate(final Node obj) throws IllegalArgumentException {
        if (SaAnalysisContextNode.canInstantiate(obj))
        	return new SaAnalysisContextNode(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextNode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("676cc60c-f3d7-4d18-a3d1-f0635f5b4f21")
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
    @objid ("447f7f9c-2cd5-411a-928c-198852a99f4d")
    @Override
    public Node getElement() {
        return (Node)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Node_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b520c067-b5c6-408a-acdd-c09e1010d36e")
    public String getSaAnalysisContext_Node_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT);
    }

    @objid ("f2c55eff-27a2-4ff0-bdb4-5413fae7bd12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Node_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c491bad7-e4a5-4620-8cc0-cb39f1e80a9b")
    public boolean isSaAnalysisContext_Node_isSched() {
        return this.elt.isTagged(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Node_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e865a66-f38d-4c0a-8212-66de4ce26f05")
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
    @objid ("991604ca-e27e-4ef7-970d-b7dce7de7d56")
    public void setSaAnalysisContext_Node_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextNode.MdaTypes.SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT, value);
    }

    @objid ("87819b04-0a83-4512-b986-57f10e6de5f5")
    protected SaAnalysisContextNode(final Node elt) {
        super(elt);
    }

    @objid ("4b1c5429-215b-471a-9cae-22c2e5e3cc8a")
    public static final class MdaTypes {
        @objid ("ae5a74f1-ec24-4b5b-9914-14c60f915b93")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("61ce4df0-7898-478a-a88c-1718f92589b9")
        public static TagType SAANALYSISCONTEXT_NODE_ISSCHED_TAGTYPE_ELT;

        @objid ("00ff465f-09ba-441a-86c0-80ac17f56ac3")
        public static TagType SAANALYSISCONTEXT_NODE_OPTCRITERION_TAGTYPE_ELT;

        @objid ("9ccaa797-22fa-4ccb-a214-b98e00d7e85d")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bd98508-da15-4ec9-9da9-05b676b5931b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4a31dd1e-f9c2-409c-93ca-c11225ed5590")
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
