/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwArbiter_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1ba5d27a-4a8f-4693-a5e7-6aa79d993d8a")
public class HwArbiterInstance extends HwCommunicationResourceInstance {
    @objid ("5d94dd52-5326-4be7-9f33-bd3557c734de")
    public static final String STEREOTYPE_NAME = "HwArbiter_Instance";

    @objid ("ff136d78-4758-4a13-9867-5caa789cf5d0")
    public static final String HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Instance_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwArbiter_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a293a276-abce-4c5d-9649-704ce3dc180d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwArbiter_Instance >> then instantiate a {@link HwArbiterInstance} proxy.
     * 
     * @return a {@link HwArbiterInstance} proxy on the created {@link Instance}.
     */
    @objid ("a3ad6d53-9d17-4e37-9067-f5dc3792247b")
    public static HwArbiterInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterInstance.STEREOTYPE_NAME);
        return HwArbiterInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterInstance} proxy from a {@link Instance} stereotyped << HwArbiter_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwArbiterInstance} proxy or <i>null</i>.
     */
    @objid ("de062684-9838-413e-8c2a-3c0363e72bda")
    public static HwArbiterInstance instantiate(final Instance obj) {
        return HwArbiterInstance.canInstantiate(obj) ? new HwArbiterInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterInstance} proxy from a {@link Instance} stereotyped << HwArbiter_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwArbiterInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f5449687-987d-435a-80ac-80a13b9c2e12")
    public static HwArbiterInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwArbiterInstance.canInstantiate(obj))
        	return new HwArbiterInstance(obj);
        else
        	throw new IllegalArgumentException("HwArbiterInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8298f7f9-4c55-411d-bc0e-212ac603153a")
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
        HwArbiterInstance other = (HwArbiterInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("aa52a560-a75a-45bb-96de-b7568617ee1e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Instance_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("76ee0616-48cf-49f0-85fd-473ad4ab5399")
    public List<String> getHwArbiter_Instance_controlledMedias() {
        return this.elt.getTagValues(HwArbiterInstance.MdaTypes.HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("f6f133b8-69c4-420b-844a-f1724cbc9cd6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Instance_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37fc50c5-7afd-4d53-a62d-0d06642e2210")
    public void setHwArbiter_Instance_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterInstance.MdaTypes.HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("dc125be6-d5d8-4609-b142-041c2b4d1468")
    protected HwArbiterInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f6cf57a3-967a-4a85-8ebb-611f1519d6a2")
    public static final class MdaTypes {
        @objid ("f567e11b-08f2-41bd-91b2-da1449f6d6c1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7de235d1-443e-4b6c-8815-f6459428f305")
        public static TagType HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("99c4baad-43d2-4e82-9eaf-78d1e630441e")
        private static Stereotype MDAASSOCDEP;

        @objid ("be3308f6-3433-498c-8c5d-a3be1ccba9ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2841547e-32d6-448a-9022-f25ef5f5e65a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036aeb-0ccf-11df-8525-001302895b2b");
            HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01036af2-0ccf-11df-8525-001302895b2b");
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
