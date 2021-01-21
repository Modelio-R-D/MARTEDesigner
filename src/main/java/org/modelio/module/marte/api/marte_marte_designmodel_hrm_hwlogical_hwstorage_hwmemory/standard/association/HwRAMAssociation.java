/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

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
 * Proxy class to handle a {@link Association} with << HwRAM_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f062b84c-3f13-4ef3-8502-a5c0fc9a9758")
public class HwRAMAssociation extends HwMemoryAssociation {
    @objid ("38a6a691-70d5-4b77-9ec5-b2181d069cfa")
    public static final String STEREOTYPE_NAME = "HwRAM_Association";

    @objid ("10696143-e943-402d-a426-dcc9914b219a")
    public static final String HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE = "HwRAM_Association_isNonVolatile";

    @objid ("e57fedf2-bfe1-4afe-8c51-e4863cbc45c1")
    public static final String HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE = "HwRAM_Association_isStatic";

    @objid ("2d56685b-c5f8-47e2-a323-332473f1b59d")
    public static final String HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Association_isSynchronous";

    @objid ("2b4044de-cad8-4a54-aabe-7a3e6d742e9b")
    public static final String HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE = "HwRAM_Association_organization";

    @objid ("5a92400e-3c20-475e-8072-4cf5b28d9dbe")
    public static final String HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE = "HwRAM_Association_repl_Policy";

    @objid ("69dff00e-e47c-49c6-b383-a3b683431524")
    public static final String HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE = "HwRAM_Association_writePolicy";

    /**
     * Tells whether a {@link HwRAMAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwRAM_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6a3d07f2-eef1-4fb1-a346-8c1e24fc1126")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwRAM_Association >> then instantiate a {@link HwRAMAssociation} proxy.
     * 
     * @return a {@link HwRAMAssociation} proxy on the created {@link Association}.
     */
    @objid ("e08c3acd-1775-49cf-8c87-4feb20cea123")
    public static HwRAMAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociation.STEREOTYPE_NAME);
        return HwRAMAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociation} proxy from a {@link Association} stereotyped << HwRAM_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwRAMAssociation} proxy or <i>null</i>.
     */
    @objid ("e474cce8-2ed0-4686-b577-a6d06eaf4b8c")
    public static HwRAMAssociation instantiate(final Association obj) {
        return HwRAMAssociation.canInstantiate(obj) ? new HwRAMAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociation} proxy from a {@link Association} stereotyped << HwRAM_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwRAMAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1ac0eb09-846d-4f87-9e2f-3cbec27d0080")
    public static HwRAMAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwRAMAssociation.canInstantiate(obj))
        	return new HwRAMAssociation(obj);
        else
        	throw new IllegalArgumentException("HwRAMAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5fdd1362-cfb6-41bb-9fc1-e0b1e49f5b1a")
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
        HwRAMAssociation other = (HwRAMAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("9e7b0e8f-9ca5-4726-97fe-69b890e39eaf")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("106031c8-36bf-4a47-8c3b-1721d174035c")
    public String getHwRAM_Association_organization() {
        return this.elt.getTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6127da6c-3f16-4551-9b9d-623c722d919a")
    public String getHwRAM_Association_repl_Policy() {
        return this.elt.getTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("458933f8-d11b-4a6e-8f41-2d64b91064e8")
    public String getHwRAM_Association_writePolicy() {
        return this.elt.getTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("a4eaeea3-091e-4681-b57f-9d7ca85a7661")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Association_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce308b7b-75b8-4245-aef3-ea701953df65")
    public boolean isHwRAM_Association_isNonVolatile() {
        return this.elt.isTagged(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Association_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d467e693-8c13-45cb-a33c-ec9d507dc751")
    public boolean isHwRAM_Association_isStatic() {
        return this.elt.isTagged(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab66704e-7239-4288-9330-457d79e17750")
    public boolean isHwRAM_Association_isSynchronous() {
        return this.elt.isTagged(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Association_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("525ada17-983e-47cd-bffb-f1d55fb64aa5")
    public void setHwRAM_Association_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Association_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e90bd427-aadb-4464-8a4e-3d5ca589a117")
    public void setHwRAM_Association_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5721600e-fbac-4972-a3a6-c0d0056c6265")
    public void setHwRAM_Association_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73c19657-a5f1-4e6d-b207-eef5c2335fc3")
    public void setHwRAM_Association_organization(final String value) {
        this.elt.putTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cac31f68-b2ea-4753-af28-220dabe18c78")
    public void setHwRAM_Association_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ceaac1dd-c24a-4072-a84b-63a882a81723")
    public void setHwRAM_Association_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMAssociation.MdaTypes.HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("369fcb03-14ee-4e55-a25f-ad7d8f2fe0b6")
    protected HwRAMAssociation(final Association elt) {
        super(elt);
    }

    @objid ("e2c13fa3-ce3c-471f-be76-27cfa747710a")
    public static final class MdaTypes {
        @objid ("aea86311-337b-42e8-80b0-fb65ab3e4736")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4157c2b6-06fc-479f-8d3c-c82ded0a9ce9")
        public static TagType HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT;

        @objid ("3cd3ea06-253d-4229-b799-e36713bcdd58")
        public static TagType HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT;

        @objid ("5772c7fb-1e77-4bd6-b8b5-91db7a2aaa26")
        public static TagType HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("95988cec-19b7-473d-8b29-24f1543c34e4")
        public static TagType HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("6fce620f-15d7-4130-831e-f668e31c94a6")
        public static TagType HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT;

        @objid ("a9f10451-add8-41d3-9024-668d5611fd2c")
        public static TagType HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("5fd4f78f-f857-46ab-93ee-b37029d2b4e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("3a5a71aa-31c7-4be5-a14e-00bed3f0df0c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8a5e31ce-5bd4-4708-a04d-2aa0ab36540e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "071f4048-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "307b9f9d-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "307b9fa1-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "307b9fa2-1007-11df-86fe-0014222a9f79");
            HWRAM_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c4ca1c45-170f-11df-b92a-0014222a9f79");
            HWRAM_ASSOCIATION_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c4ca1c46-170f-11df-b92a-0014222a9f79");
            HWRAM_ASSOCIATION_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c4ca1c47-170f-11df-b92a-0014222a9f79");
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
