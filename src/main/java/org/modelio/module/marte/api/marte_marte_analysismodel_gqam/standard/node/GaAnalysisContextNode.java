/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.node;

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
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.node.ConfigurationNode;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Node} with << GaAnalysisContext_Node >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaAnalysisContextNode extends ConfigurationNode {
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Node";

    public static final String GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Node_contextParams";

    public static final String GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE = "GaAnalysisContext_Node_platform";

    public static final String GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE = "GaAnalysisContext_Node_workload";

    /**
     * Tells whether a {@link GaAnalysisContextNode proxy} can be instantiated from a {@link MObject} checking it is a {@link Node} stereotyped << GaAnalysisContext_Node >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Node) && ((Node) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextNode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Node} stereotyped << GaAnalysisContext_Node >> then instantiate a {@link GaAnalysisContextNode} proxy.
     * 
     * @return a {@link GaAnalysisContextNode} proxy on the created {@link Node}.
     */
    public static GaAnalysisContextNode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Node");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextNode.STEREOTYPE_NAME);
        return GaAnalysisContextNode.instantiate((Node)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextNode} proxy from a {@link Node} stereotyped << GaAnalysisContext_Node >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Node
     * @return a {@link GaAnalysisContextNode} proxy or <i>null</i>.
     */
    public static GaAnalysisContextNode instantiate(final Node obj) {
        return GaAnalysisContextNode.canInstantiate(obj) ? new GaAnalysisContextNode(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextNode} proxy from a {@link Node} stereotyped << GaAnalysisContext_Node >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Node}
     * @return a {@link GaAnalysisContextNode} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaAnalysisContextNode safeInstantiate(final Node obj) throws IllegalArgumentException {
        if (GaAnalysisContextNode.canInstantiate(obj))
        	return new GaAnalysisContextNode(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextNode: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaAnalysisContextNode other = (GaAnalysisContextNode) obj;
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
     * Getter for List<String> property 'GaAnalysisContext_Node_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Node_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Node_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Node_platform() {
        return this.elt.getTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Node_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Node_workload() {
        return this.elt.getTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Node_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Node_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Node_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Node_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Node_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Node_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT, values);
    }

    protected GaAnalysisContextNode(final Node elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42b26f53-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42b26f54-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42b26f55-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42b26f56-149f-11df-9d54-0014222a9f79");
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
