/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << Configuration_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b8bad2a2-2948-4dd7-87e1-419472605a55")
public class ConfigurationBehavior {
    @objid ("13e35cb7-d693-4119-9155-7a953b7da473")
    public static final String STEREOTYPE_NAME = "Configuration_Behavior";

    @objid ("b55b749c-460a-454b-9814-71d7a4b28895")
    public static final String CONFIGURATION_BEHAVIOR_MODE_TAGTYPE = "Configuration_Behavior_mode";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("00577895-9fbd-48f2-bc25-f006ba151277")
    protected final Behavior elt;

    /**
     * Tells whether a {@link ConfigurationBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << Configuration_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("35617fb7-0574-44e9-af3d-875eb6c489b7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << Configuration_Behavior >> then instantiate a {@link ConfigurationBehavior} proxy.
     * 
     * @return a {@link ConfigurationBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("b9ccabd1-35d1-4539-a3c4-c01082625bf3")
    public static ConfigurationBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationBehavior.STEREOTYPE_NAME);
        return ConfigurationBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationBehavior} proxy from a {@link Behavior} stereotyped << Configuration_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link ConfigurationBehavior} proxy or <i>null</i>.
     */
    @objid ("1d1a2820-422f-4910-853c-522817ec53fc")
    public static ConfigurationBehavior instantiate(final Behavior obj) {
        return ConfigurationBehavior.canInstantiate(obj) ? new ConfigurationBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConfigurationBehavior} proxy from a {@link Behavior} stereotyped << Configuration_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link ConfigurationBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("85136dba-f246-4484-8c97-73a63e09c845")
    public static ConfigurationBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (ConfigurationBehavior.canInstantiate(obj))
        	return new ConfigurationBehavior(obj);
        else
        	throw new IllegalArgumentException("ConfigurationBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e55f5e2-5111-4016-8185-2d888623edcc")
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
        ConfigurationBehavior other = (ConfigurationBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Configuration_Behavior_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("108b34a8-b4e6-431f-9604-8fcaeb67cd95")
    public List<String> getConfiguration_Behavior_mode() {
        return this.elt.getTagValues(ConfigurationBehavior.MdaTypes.CONFIGURATION_BEHAVIOR_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("dca30aee-125e-492f-ac94-3eb2912a4e7d")
    public Behavior getElement() {
        return this.elt;
    }

    @objid ("e4d299ee-9c40-4df3-8017-5964abb47a35")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Behavior_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30973a86-3e26-42be-bfb7-6156a005d9f0")
    public void setConfiguration_Behavior_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationBehavior.MdaTypes.CONFIGURATION_BEHAVIOR_MODE_TAGTYPE_ELT, values);
    }

    @objid ("dd9574f5-25d3-4475-8ab9-05cc5c0d6cae")
    protected ConfigurationBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("a1c22b9e-70c6-4acb-8c36-590b4860f632")
    public static final class MdaTypes {
        @objid ("947a7acc-796a-43c7-a103-c71abdfcc181")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fc7b1a3-2f3f-4b64-9f2b-eee643a89686")
        public static TagType CONFIGURATION_BEHAVIOR_MODE_TAGTYPE_ELT;

        @objid ("eca57517-fa56-4cc4-b4b0-208d6693d914")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb68eec0-f3b5-4f60-97bc-09dcb3f0ea3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eea05670-f6a0-40f8-97f1-fe3dbfc70b32")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f893dc8c-1562-11df-b173-0014222a9f79");
            CONFIGURATION_BEHAVIOR_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f893dc8d-1562-11df-b173-0014222a9f79");
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
