/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Configuration_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ConfigurationClass {
    public static final String STEREOTYPE_NAME = "Configuration_Class";

    public static final String CONFIGURATION_CLASS_MODE_TAGTYPE = "Configuration_Class_mode";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link ConfigurationClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Configuration_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Configuration_Class >> then instantiate a {@link ConfigurationClass} proxy.
     * 
     * @return a {@link ConfigurationClass} proxy on the created {@link Class}.
     */
    public static ConfigurationClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationClass.STEREOTYPE_NAME);
        return ConfigurationClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationClass} proxy from a {@link Class} stereotyped << Configuration_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ConfigurationClass} proxy or <i>null</i>.
     */
    public static ConfigurationClass instantiate(final Class obj) {
        return ConfigurationClass.canInstantiate(obj) ? new ConfigurationClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConfigurationClass} proxy from a {@link Class} stereotyped << Configuration_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ConfigurationClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ConfigurationClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConfigurationClass.canInstantiate(obj))
        	return new ConfigurationClass(obj);
        else
        	throw new IllegalArgumentException("ConfigurationClass: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ConfigurationClass other = (ConfigurationClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Configuration_Class_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getConfiguration_Class_mode() {
        return this.elt.getTagValues(ConfigurationClass.MdaTypes.CONFIGURATION_CLASS_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    public Class getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Class_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setConfiguration_Class_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationClass.MdaTypes.CONFIGURATION_CLASS_MODE_TAGTYPE_ELT, values);
    }

    protected ConfigurationClass(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CONFIGURATION_CLASS_MODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "def5f655-11a4-11df-b398-0014222a9f79");
            CONFIGURATION_CLASS_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "def5f656-11a4-11df-b398-0014222a9f79");
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
