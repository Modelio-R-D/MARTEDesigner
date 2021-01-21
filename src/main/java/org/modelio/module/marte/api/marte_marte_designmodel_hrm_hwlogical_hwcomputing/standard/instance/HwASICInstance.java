/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Instance} with << HwASIC_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f2f90118-2598-4869-a719-5941b9cbf913")
public class HwASICInstance extends HwComputingResourceInstance {
    @objid ("c960695a-a8f0-4bb4-a9a2-abedb9e3d348")
    public static final String STEREOTYPE_NAME = "HwASIC_Instance";

    /**
     * Tells whether a {@link HwASICInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwASIC_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8b8b2844-e371-439b-9cd8-2f0ff14d073a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwASIC_Instance >> then instantiate a {@link HwASICInstance} proxy.
     * 
     * @return a {@link HwASICInstance} proxy on the created {@link Instance}.
     */
    @objid ("d1b75264-816c-41f0-ba2d-114baa3333b6")
    public static HwASICInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICInstance.STEREOTYPE_NAME);
        return HwASICInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwASICInstance} proxy from a {@link Instance} stereotyped << HwASIC_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwASICInstance} proxy or <i>null</i>.
     */
    @objid ("3524ee0d-2cf7-4222-a6e1-8ea85790f031")
    public static HwASICInstance instantiate(final Instance obj) {
        return HwASICInstance.canInstantiate(obj) ? new HwASICInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICInstance} proxy from a {@link Instance} stereotyped << HwASIC_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwASICInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1a9fbf17-ecdc-4142-9873-1395fa025b07")
    public static HwASICInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwASICInstance.canInstantiate(obj))
        	return new HwASICInstance(obj);
        else
        	throw new IllegalArgumentException("HwASICInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0e85cde6-e956-4cff-a82a-6601de664c04")
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
        HwASICInstance other = (HwASICInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e51e2652-3520-4862-9380-9609faba628c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("a4474016-132a-4196-8cd8-157f2f7eae74")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ad87a5ae-51a1-4f3e-a760-b604d523b0c1")
    protected HwASICInstance(final Instance elt) {
        super(elt);
    }

    @objid ("3262787a-38a6-4a3f-8093-d09bfda8de69")
    public static final class MdaTypes {
        @objid ("3c488917-3809-4869-9768-a2061db49acb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d1f60dcb-6988-48ed-9388-2926792ad64a")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f600b6c-e869-44be-be73-0d75ee4aa7c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("80f86a03-e9a5-4ba5-9630-d1766fec1ce2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00e93166-0ccf-11df-8525-001302895b2b");
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
