/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("59f4fa34-3f9a-4b5b-994d-c3af49bae1b5")
    public static final String STEREOTYPE_NAME = "HwASIC_Instance";

    /**
     * Tells whether a {@link HwASICInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwASIC_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c44efbab-93c1-4e40-bfdc-c024e87a6d38")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwASIC_Instance >> then instantiate a {@link HwASICInstance} proxy.
     * 
     * @return a {@link HwASICInstance} proxy on the created {@link Instance}.
     */
    @objid ("23adbc76-6f59-468b-8351-336e59f7cb08")
    public static HwASICInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICInstance.STEREOTYPE_NAME);
        return HwASICInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwASICInstance} proxy from a {@link Instance} stereotyped << HwASIC_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwASICInstance} proxy or <i>null</i>.
     */
    @objid ("3f842f4a-1700-4717-9405-dc377b8810ad")
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
    @objid ("f3f50e2c-2520-4220-aa93-38c5f3d39e08")
    public static HwASICInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwASICInstance.canInstantiate(obj))
        	return new HwASICInstance(obj);
        else
        	throw new IllegalArgumentException("HwASICInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b979ada-a0f1-46cd-af94-d7c2905a75db")
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
    @objid ("7be44090-5e07-440c-bd7a-1515f858af6c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("068287d6-3bd2-4ba4-9a01-e0165cc2aaa5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("62ed67d0-35fe-4cac-a049-996186bd7471")
    protected HwASICInstance(final Instance elt) {
        super(elt);
    }

    @objid ("3262787a-38a6-4a3f-8093-d09bfda8de69")
    public static final class MdaTypes {
        @objid ("cfc33b6e-668f-4df0-9089-dfed1ef228b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6d778ee0-eac1-434d-92c6-f196e03fe8b3")
        private static Stereotype MDAASSOCDEP;

        @objid ("dff57a58-216d-4787-9903-c83d3070b2b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8fcbc27e-de07-4f92-aedd-303008205485")
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
