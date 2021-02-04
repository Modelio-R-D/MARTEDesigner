/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("40bb7f7c-29c1-42dc-99f8-c9341480882d")
    public static final String STEREOTYPE_NAME = "Configuration_Collaboration";

    @objid ("867e4be8-08d3-4c05-8c5a-1af2b3f499be")
    public static final String CONFIGURATION_COLLABORATION_MODE_TAGTYPE = "Configuration_Collaboration_mode";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    @objid ("df15f627-a994-4a62-9faa-9147316e1b58")
    protected final Collaboration elt;

    /**
     * Tells whether a {@link ConfigurationCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << Configuration_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("92ece8c2-7e21-49bd-8ab9-9d9497fde81a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << Configuration_Collaboration >> then instantiate a {@link ConfigurationCollaboration} proxy.
     * 
     * @return a {@link ConfigurationCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("e22ce1fe-d24e-4fe7-bcbb-663b44cb1f93")
    public static ConfigurationCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationCollaboration.STEREOTYPE_NAME);
        return ConfigurationCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationCollaboration} proxy from a {@link Collaboration} stereotyped << Configuration_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link ConfigurationCollaboration} proxy or <i>null</i>.
     */
    @objid ("f3c070be-f86c-4b14-a693-760a99650349")
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
    @objid ("6e1b3555-7502-4002-9044-ea5f2ea38a4f")
    public static ConfigurationCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (ConfigurationCollaboration.canInstantiate(obj))
        	return new ConfigurationCollaboration(obj);
        else
        	throw new IllegalArgumentException("ConfigurationCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("457fcf45-57b7-478e-b5f9-97aa44146702")
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
    @objid ("c0705115-f951-46a8-bc1a-a3b9f8e34c4d")
    public List<String> getConfiguration_Collaboration_mode() {
        return this.elt.getTagValues(ConfigurationCollaboration.MdaTypes.CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("d1001839-7bb1-41fc-840c-23af6c78d764")
    public Collaboration getElement() {
        return this.elt;
    }

    @objid ("0bd97e1e-c000-435c-9f5d-250ccb6d498b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Collaboration_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b16acfc-031c-4e7d-bceb-4fe36ebb67a5")
    public void setConfiguration_Collaboration_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationCollaboration.MdaTypes.CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT, values);
    }

    @objid ("24e1e7cb-c143-4f62-9bcd-aacd37bbe6da")
    protected ConfigurationCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    @objid ("c5193a6e-85ba-4ca8-84a4-be0e17690247")
    public static final class MdaTypes {
        @objid ("850217b0-fd1d-4297-bd11-e311a2ac43f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3ec9a773-29c9-4fba-9017-388d95781f5f")
        public static TagType CONFIGURATION_COLLABORATION_MODE_TAGTYPE_ELT;

        @objid ("a981f7ba-d3d1-4a4a-b1b6-3c493e5c7b17")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a8fe875-89b1-4878-b946-0da9449d3b79")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bc46fce8-2c97-4be1-97a0-f840cca9170b")
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
