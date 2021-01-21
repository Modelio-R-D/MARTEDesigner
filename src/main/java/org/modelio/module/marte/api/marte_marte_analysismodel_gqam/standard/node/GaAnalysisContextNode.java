/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.node;

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
@objid ("6776dcdc-ad43-4153-8177-12f55da1a418")
public class GaAnalysisContextNode extends ConfigurationNode {
    @objid ("55d7dd39-d29e-4be7-b8d4-48daf454282e")
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Node";

    @objid ("f0a5405c-b040-4242-9a9d-3c8cb12247ad")
    public static final String GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Node_contextParams";

    @objid ("47e90a70-374f-4f5e-835e-2ad93bebf122")
    public static final String GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE = "GaAnalysisContext_Node_platform";

    @objid ("ac99a9cf-5a14-4185-be14-38c7755b8ab4")
    public static final String GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE = "GaAnalysisContext_Node_workload";

    /**
     * Tells whether a {@link GaAnalysisContextNode proxy} can be instantiated from a {@link MObject} checking it is a {@link Node} stereotyped << GaAnalysisContext_Node >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("70532e71-cae2-41ef-a6e0-011946d9d7ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Node) && ((Node) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextNode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Node} stereotyped << GaAnalysisContext_Node >> then instantiate a {@link GaAnalysisContextNode} proxy.
     * 
     * @return a {@link GaAnalysisContextNode} proxy on the created {@link Node}.
     */
    @objid ("63c70ab4-580f-4874-99ec-a444d728ad8f")
    public static GaAnalysisContextNode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Node");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextNode.STEREOTYPE_NAME);
        return GaAnalysisContextNode.instantiate((Node)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextNode} proxy from a {@link Node} stereotyped << GaAnalysisContext_Node >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Node
     * @return a {@link GaAnalysisContextNode} proxy or <i>null</i>.
     */
    @objid ("a7347f1f-deee-46fa-a8ec-a20aba3e08b7")
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
    @objid ("c1799225-72e3-4eec-8a32-1c51f88a95ef")
    public static GaAnalysisContextNode safeInstantiate(final Node obj) throws IllegalArgumentException {
        if (GaAnalysisContextNode.canInstantiate(obj))
        	return new GaAnalysisContextNode(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextNode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc54dce3-2e4f-4d0a-9141-85b12d6d3f3b")
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
    @objid ("297002bb-e7a7-41a1-ad0d-0ba7f2f2d46c")
    @Override
    public Node getElement() {
        return (Node)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Node_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2fdd938b-c6fb-4a2d-ae18-121432bc1e15")
    public List<String> getGaAnalysisContext_Node_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Node_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("844d3360-2e49-490d-818c-ef6d35f0dfa2")
    public List<String> getGaAnalysisContext_Node_platform() {
        return this.elt.getTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Node_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4c714b8e-13b6-431e-9fad-b2c2c46fb1f2")
    public List<String> getGaAnalysisContext_Node_workload() {
        return this.elt.getTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT);
    }

    @objid ("d44b199c-2287-4df1-a4a6-c67a0ef3e98f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Node_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08e60dbf-70bc-4863-a1b4-63889d9049e5")
    public void setGaAnalysisContext_Node_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Node_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da0daf2e-e991-4d93-ac19-1ae6b1f3d974")
    public void setGaAnalysisContext_Node_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Node_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb6bd69a-9c21-41a8-9a14-a4b4be496da9")
    public void setGaAnalysisContext_Node_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextNode.MdaTypes.GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT, values);
    }

    @objid ("80beddfa-7c0a-4b28-bde9-7928de223409")
    protected GaAnalysisContextNode(final Node elt) {
        super(elt);
    }

    @objid ("986e480f-6389-41d7-94bb-28a677ec2bff")
    public static final class MdaTypes {
        @objid ("19c63f16-e47a-47de-9fa6-1de17ee49512")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f165c9ae-4c27-44bd-bc89-3308a4307507")
        public static TagType GAANALYSISCONTEXT_NODE_CONTEXTPARAMS_TAGTYPE_ELT;

        @objid ("24745a87-cc86-46ed-8d42-ecb1ac02f9ab")
        public static TagType GAANALYSISCONTEXT_NODE_WORKLOAD_TAGTYPE_ELT;

        @objid ("637371b6-c0cc-48aa-896a-ac4fa1dbd44a")
        public static TagType GAANALYSISCONTEXT_NODE_PLATFORM_TAGTYPE_ELT;

        @objid ("8220cc0e-484a-43fa-aa3f-852bf811cfd6")
        private static Stereotype MDAASSOCDEP;

        @objid ("76568fe0-4034-4a36-a7cb-da91069e0ee3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("abda8268-45e7-42bc-b312-abdc76c5deb0")
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
