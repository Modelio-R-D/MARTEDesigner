/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << Configuration_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("453960a0-f515-4082-ae10-539b4ae01cd2")
public class ConfigurationCollaboration {
    @objid ("af2d8378-f7c1-4edc-863c-0d40d4565a5a")
    public static final String STEREOTYPE_NAME = "Configuration_Collaboration";

    @objid ("b12574d3-1306-4432-baeb-c6f8dcc9076c")
    public static final String CONFIGURATION_COLLABORATION_MODE_TAGTYPE = "Configuration_Collaboration_mode";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    @objid ("de566bff-1c28-4256-88ab-fb05f4a50785")
    protected final Collaboration elt;

    /**
     * Tells whether a {@link ConfigurationCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << Configuration_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("345da940-60dc-43cf-b913-822a767a196b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << Configuration_Collaboration >> then instantiate a {@link ConfigurationCollaboration} proxy.
     * 
     * @return a {@link ConfigurationCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("c144b92e-60a6-489c-9123-e0ad50ded116")
    public static ConfigurationCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationCollaboration.STEREOTYPE_NAME);
        return ConfigurationCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationCollaboration} proxy from a {@link Collaboration} stereotyped << Configuration_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link ConfigurationCollaboration} proxy or <i>null</i>.
     */
    @objid ("ab6ef7b5-0e01-471b-bb50-1ccca2d709f4")
    public static ConfigurationCollaboration instantiate(final Collaboration obj) {
        return ConfigurationCollaboration.canInstantiate(obj) ? new ConfigurationCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConfigurationCollaboration} proxy from a {@link Collaboration} stereotyped << Configuration_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link ConfigurationCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d3e721f7-1686-49da-8afe-6762f32089be")
    public static ConfigurationCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (ConfigurationCollaboration.canInstantiate(obj))
        	return new ConfigurationCollaboration(obj);
        else
        	throw new IllegalArgumentException("ConfigurationCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("55db5081-f4da-4133-b454-c7c667b4aac1")
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
        ConfigurationCollaboration other = (ConfigurationCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Configuration_Collaboration_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f7ef255-8d3b-43cf-bba4-21e9506b0e84")
    public List<String> getConfiguration_Collaboration_mode() {
        return this.elt.getTagValues(ConfigurationCollaboration.MdaTypes.CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("2924353b-5f7b-479e-a765-743313673d5a")
    public Collaboration getElement() {
        return this.elt;
    }

    @objid ("40334d32-2317-47fa-9367-7bc65003d482")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Collaboration_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a6eb6bb-640c-4275-a1ff-f414ede258d1")
    public void setConfiguration_Collaboration_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationCollaboration.MdaTypes.CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT, values);
    }

    @objid ("7a543e90-b781-4f82-a397-b0d89443e392")
    protected ConfigurationCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    @objid ("c5193a6e-85ba-4ca8-84a4-be0e17690247")
    public static final class MdaTypes {
        @objid ("6a6f6c7d-0c44-4f44-90c2-d70f6a180e53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbf243c6-2fd4-4572-a612-7bc457c32ce8")
        public static TagType CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT;

        @objid ("afd36954-e68d-4d14-8536-4c619c710335")
        private static Stereotype MDAASSOCDEP;

        @objid ("6ab9bbc4-50a0-48b6-a644-c477c6a87311")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f3e2bf3-1229-4e17-8617-c8910969efa3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c30c40-0ccf-11df-8525-001302895b2b");
            CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c30c42-0ccf-11df-8525-001302895b2b");
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
