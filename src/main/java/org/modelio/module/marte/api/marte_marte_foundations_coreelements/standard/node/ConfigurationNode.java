/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("be18fb9b-62b2-4669-a148-8025acbfd0ed")
    public static final String STEREOTYPE_NAME = "Configuration_Node";

    @objid ("863e1c72-cd2c-4eba-acda-7cbd76f39302")
    public static final String CONFIGURATION_NODE_MODE_TAGTYPE = "Configuration_Node_mode";

    /**
     * The underlying {@link Node} represented by this proxy, never null.
     */
    @objid ("c438fdfe-356b-49ce-b771-cbe93aaf5453")
    protected final Node elt;

    /**
     * Tells whether a {@link ConfigurationNode proxy} can be instantiated from a {@link MObject} checking it is a {@link Node} stereotyped << Configuration_Node >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8b00c707-dcdf-43ee-96db-8bae9e17e2a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Node) && ((Node) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationNode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Node} stereotyped << Configuration_Node >> then instantiate a {@link ConfigurationNode} proxy.
     * 
     * @return a {@link ConfigurationNode} proxy on the created {@link Node}.
     */
    @objid ("e9280fdb-12fa-4bdd-b3a3-d07d5c86c7a8")
    public static ConfigurationNode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Node");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationNode.STEREOTYPE_NAME);
        return ConfigurationNode.instantiate((Node)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationNode} proxy from a {@link Node} stereotyped << Configuration_Node >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Node
     * @return a {@link ConfigurationNode} proxy or <i>null</i>.
     */
    @objid ("612cb679-92d8-425f-8433-2573c99a26e6")
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
    @objid ("752e9155-bb0a-4357-b535-8af1281fc180")
    public static ConfigurationNode safeInstantiate(final Node obj) throws IllegalArgumentException {
        if (ConfigurationNode.canInstantiate(obj))
        	return new ConfigurationNode(obj);
        else
        	throw new IllegalArgumentException("ConfigurationNode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a93b6811-a95c-4da8-b2ab-2e8c22cbda14")
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
    @objid ("03cf77f5-629b-4703-9458-3fc6f4386135")
    public List<String> getConfiguration_Node_mode() {
        return this.elt.getTagValues(ConfigurationNode.MdaTypes.CONFIGURATION_NODE_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Node}. 
     * @return the Node represented by this proxy, never null.
     */
    @objid ("92ae56db-c325-4764-a4f4-39119431a2eb")
    public Node getElement() {
        return this.elt;
    }

    @objid ("8de94668-920d-420d-bcc3-16d93f62f57f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Node_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb14325b-f97a-4be0-9e7b-d00ecafe32f1")
    public void setConfiguration_Node_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationNode.MdaTypes.CONFIGURATION_NODE_MODE_TAGTYPE_ELT, values);
    }

    @objid ("a28f3aec-9930-443b-8723-97b19514a94b")
    protected ConfigurationNode(final Node elt) {
        this.elt = elt;
    }

    @objid ("78881e8b-b727-488b-ada6-867c6081a0ef")
    public static final class MdaTypes {
        @objid ("8cf2b626-c53c-472e-a05a-be1b41a0e219")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87672dd5-b6bb-487f-af65-ced23339ef57")
        public static TagType CONFIGURATION_NODE_MODE_TAGTYPE_ELT;

        @objid ("2f1e8955-427e-4aec-b27d-d93a6c140aa5")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a7478f3-a007-4a97-9abe-561b81d19f6b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("11ebe343-4d22-4885-b1a7-517ab5c38233")
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
