/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.class_;

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
@objid ("7df95cb1-e011-42bc-bec8-e55f9af3608d")
public class ConfigurationClass {
    @objid ("21ba21b0-61ca-49f8-a00c-9aabc0ca3648")
    public static final String STEREOTYPE_NAME = "Configuration_Class";

    @objid ("130f81fc-7dc8-44dd-84d9-2b76bc16c6dc")
    public static final String CONFIGURATION_CLASS_MODE_TAGTYPE = "Configuration_Class_mode";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7beaba29-10c2-4b60-acaa-0792c2df6f8f")
    protected final Class elt;

    /**
     * Tells whether a {@link ConfigurationClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Configuration_Class >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("43168249-cef3-4b43-89e6-221612df389a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Configuration_Class >> then instantiate a {@link ConfigurationClass} proxy.
     * 
     * @return a {@link ConfigurationClass} proxy on the created {@link Class}.
     */
    @objid ("4679d638-cbae-4434-981d-9d0c71bac943")
    public static ConfigurationClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConfigurationClass.STEREOTYPE_NAME);
        return ConfigurationClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ConfigurationClass} proxy from a {@link Class} stereotyped << Configuration_Class >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ConfigurationClass} proxy or <i>null</i>.
     */
    @objid ("fa92614b-8dd0-47d5-a877-64214c39ca94")
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
    @objid ("1a350873-6fb1-4b6a-89e5-4c1bfcc7f37c")
    public static ConfigurationClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ConfigurationClass.canInstantiate(obj))
        	return new ConfigurationClass(obj);
        else
        	throw new IllegalArgumentException("ConfigurationClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2146ee37-eee5-478a-9d9c-432752ae6813")
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
    @objid ("d4fdeaf0-cdf7-4906-929c-9e88eba5e65a")
    public List<String> getConfiguration_Class_mode() {
        return this.elt.getTagValues(ConfigurationClass.MdaTypes.CONFIGURATION_CLASS_MODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("06ffd535-623a-45b9-a34c-ae54e312c3f3")
    public Class getElement() {
        return this.elt;
    }

    @objid ("5a4043b3-1546-4e6f-8871-ea950ed22134")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Configuration_Class_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a91dd415-b24e-4bfe-9cc5-68c5e2d266cd")
    public void setConfiguration_Class_mode(final List<String> values) {
        this.elt.putTagValues(ConfigurationClass.MdaTypes.CONFIGURATION_CLASS_MODE_TAGTYPE_ELT, values);
    }

    @objid ("4e5c2645-8a3a-416e-9e81-1ff36dfa8953")
    protected ConfigurationClass(final Class elt) {
        this.elt = elt;
    }

    @objid ("5ff585b3-8e09-4b5c-bf6b-474a234ba483")
    public static final class MdaTypes {
        @objid ("87bda2ae-353f-4d9a-97bb-ee8c56f1accf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e89ec9b1-2aae-411e-913e-d398a641f27e")
        public static TagType CONFIGURATION_CLASS_MODE_TAGTYPE_ELT;

        @objid ("7b0c65ba-a9a9-4eac-8053-8dc0959f2b2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ce567ce1-a391-48c1-84cc-db250ba2e177")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e06fc824-11b5-4603-835f-3c5d5de9118f")
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
