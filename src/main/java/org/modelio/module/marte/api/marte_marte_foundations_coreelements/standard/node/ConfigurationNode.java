/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.node;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Node} with << Configuration_Node >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1376f455-7e78-4066-85c5-4d0333563a6f")
public class ConfigurationNode {
    @objid ("b921389c-f0a6-4e0d-97a6-0f819659cc1c")
    public static final String STEREOTYPE_NAME = "Configuration_Node";

    @objid ("fc339bb0-2983-4477-9ae3-5f059ef498d5")
    public static final String CONFIGURATION_NODE_MODE_TAGTYPE = "Configuration_Node_mode";

    /**
     * The underlying {@link Node} represented by this proxy, never null.
     */
    @objid ("46ab5440-3515-461b-9fec-a3ed7a248920")
    protected final Node elt;

    /**
     * Tells whether a {@link ConfigurationNode proxy} can be instantiated from a {@link MObject} checking it is a {@link Node} stereotyped << Configuration_Node >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("16c2d1f0-288d-4add-aeaa-1c5806a7c223")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Node) && ((Node) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationNode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Node} stereotyped << Configuration_Node >> then instantiate a {@link ConfigurationNode} proxy.
     * 
     * @return a {@link ConfigurationNode} proxy on the created {@link Node}.
     */
    @objid ("bf5a8935-e254-4395-a294-17197aa0c313")
    public static ConfigurationNode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Node");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationNode.STEREOTYPE_NAME);
        return ConfigurationNode.instantiate((Node)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationNode} proxy from a {@link Node} stereotyped << Configuration_Node >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Node
     * @return a {@link ConfigurationNode} proxy or <i>null</i>.
     */
    @objid ("2c76e22e-9186-4c44-bf91-752c972059ee")
    public static ConfigurationNode instantiate(final Node obj) {
        return ConfigurationNode.canInstantiate(obj) ? new ConfigurationNode(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConfigurationNode} proxy from a {@link Node} stereotyped << Configuration_Node >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Node}
     * @return a {@link ConfigurationNode} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1f9652ec-0714-49e1-baa2-d210c3850df9")
    public static ConfigurationNode safeInstantiate(final Node obj) throws IllegalArgumentException {
        if (ConfigurationNode.canInstantiate(obj))
        	return new ConfigurationNode(obj);
        else
        	throw new IllegalArgumentException("ConfigurationNode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4967fa5f-91b1-454f-a28b-35eec3b58a55")
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
        ConfigurationNode other = (ConfigurationNode) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Configuration_Node_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5cce95f1-5d6d-403f-8fde-c9cb983932d3")
    public List<String> getConfiguration_Node_mode() {
        return this.elt.getTagValues(ConfigurationNode.MdaTypes.CONFIGURATION_NODE_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Node}. 
     * @return the Node represented by this proxy, never null.
     */
    @objid ("0643565b-fa7c-47cf-9e93-cd056b1d09ee")
    public Node getElement() {
        return this.elt;
    }

    @objid ("5e749f3b-c387-4af4-b2cc-00c9cfd9888f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Node_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe20dbc2-99cb-49f1-a559-92655117e876")
    public void setConfiguration_Node_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationNode.MdaTypes.CONFIGURATION_NODE_MODE_TAGTYPE_ELT, values);
    }

    @objid ("07cb3a8d-2a95-4bdc-a962-4617b6f04bc4")
    protected ConfigurationNode(final Node elt) {
        this.elt = elt;
    }

    @objid ("78881e8b-b727-488b-ada6-867c6081a0ef")
    public static final class MdaTypes {
        @objid ("8a1a1bc5-9135-432d-ac05-8e5e5b1be576")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f40299ec-f74a-40c6-a2b8-9dc3ff5d4b2e")
        public static TagType CONFIGURATION_NODE_MODE_TAGTYPE_ELT;

        @objid ("19458eef-c8b4-425c-80c9-8f59a78a5037")
        private static Stereotype MDAASSOCDEP;

        @objid ("714848c1-0721-4c22-a1d3-c1f63da70d6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("54907e3d-1ba4-4f14-8ddc-8228f519f129")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f8727b4d-1562-11df-b173-0014222a9f79");
            CONFIGURATION_NODE_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8727b4e-1562-11df-b173-0014222a9f79");
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
