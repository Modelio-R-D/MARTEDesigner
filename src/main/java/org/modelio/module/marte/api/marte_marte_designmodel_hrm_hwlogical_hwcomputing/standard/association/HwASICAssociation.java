/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwASIC_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c37be7c9-2b24-4d51-ac6c-d92f1073bace")
public class HwASICAssociation extends HwComputingResourceAssociation {
    @objid ("3316187f-e921-432d-bf34-1d1ef5161531")
    public static final String STEREOTYPE_NAME = "HwASIC_Association";

    /**
     * Tells whether a {@link HwASICAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwASIC_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f185faa1-a740-4177-b4f5-d7ff710af729")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwASIC_Association >> then instantiate a {@link HwASICAssociation} proxy.
     * 
     * @return a {@link HwASICAssociation} proxy on the created {@link Association}.
     */
    @objid ("06373758-6053-4edf-8352-dcaad9ed66f1")
    public static HwASICAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAssociation.STEREOTYPE_NAME);
        return HwASICAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwASICAssociation} proxy from a {@link Association} stereotyped << HwASIC_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwASICAssociation} proxy or <i>null</i>.
     */
    @objid ("ca54ab9e-103f-4a4a-bf89-a6bfc0da3087")
    public static HwASICAssociation instantiate(final Association obj) {
        return HwASICAssociation.canInstantiate(obj) ? new HwASICAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICAssociation} proxy from a {@link Association} stereotyped << HwASIC_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwASICAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("62f03859-97f2-44ce-acbd-a4c7281d4eae")
    public static HwASICAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwASICAssociation.canInstantiate(obj))
        	return new HwASICAssociation(obj);
        else
        	throw new IllegalArgumentException("HwASICAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3046335f-7b95-4ea6-afac-6f4799f13a91")
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
        HwASICAssociation other = (HwASICAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("ff60511a-2fd3-4633-9a83-04472313c8c3")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("7a9a0fd4-caf7-4154-8612-763a26eab8ac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a8a0ee94-fd90-46c2-a97b-1e44f8ffdb26")
    protected HwASICAssociation(final Association elt) {
        super(elt);
    }

    @objid ("b1a8cb13-a4ae-4b88-a909-a3e1f8cbb3e5")
    public static final class MdaTypes {
        @objid ("681f0fd5-fc3f-43c2-bdb3-1a378bf4f244")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ef64911-9061-46d1-b6da-36fdb8a628d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("3151789a-b691-4d94-a5c1-dc71422210c6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08e88957-a10e-4b5e-841c-549a37ee9ab9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b4666f29-10a3-11df-81d9-0014222a9f79");
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
