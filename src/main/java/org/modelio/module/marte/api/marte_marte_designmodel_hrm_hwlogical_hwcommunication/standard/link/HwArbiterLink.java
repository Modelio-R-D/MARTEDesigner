/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwArbiter_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("df94cda4-8a40-4467-b088-b92a54aa6a88")
public class HwArbiterLink extends HwCommunicationResourceLink {
    @objid ("4c5281e5-7904-4ded-87cc-a5f1484629da")
    public static final String STEREOTYPE_NAME = "HwArbiter_Link";

    @objid ("8dcf8d6c-df28-4122-8442-6fc6168c1080")
    public static final String HWARBITER_LINK_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Link_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwArbiter_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0488fd1b-c693-44b2-8256-97fed34da8bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwArbiter_Link >> then instantiate a {@link HwArbiterLink} proxy.
     * 
     * @return a {@link HwArbiterLink} proxy on the created {@link Link}.
     */
    @objid ("b28edd8f-2c59-4e48-a56a-75713af4d02d")
    public static HwArbiterLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterLink.STEREOTYPE_NAME);
        return HwArbiterLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterLink} proxy from a {@link Link} stereotyped << HwArbiter_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwArbiterLink} proxy or <i>null</i>.
     */
    @objid ("12e14f18-1994-4bde-af7c-6ee94e4beeca")
    public static HwArbiterLink instantiate(final Link obj) {
        return HwArbiterLink.canInstantiate(obj) ? new HwArbiterLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterLink} proxy from a {@link Link} stereotyped << HwArbiter_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwArbiterLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("113520a7-4ca2-4507-b861-ed64eda45a64")
    public static HwArbiterLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwArbiterLink.canInstantiate(obj))
        	return new HwArbiterLink(obj);
        else
        	throw new IllegalArgumentException("HwArbiterLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e403cbdc-d2b1-430a-b4bd-3f4c75e83162")
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
        HwArbiterLink other = (HwArbiterLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("7e0d35a6-f6ec-46a4-8d87-4f7f569046a6")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Link_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6b81d280-36e7-4b19-b793-d688f8990e55")
    public List<String> getHwArbiter_Link_controlledMedias() {
        return this.elt.getTagValues(HwArbiterLink.MdaTypes.HWARBITER_LINK_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("8b0727d8-156a-4eeb-8b79-4d76af3adbd1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Link_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5ea2c10-4f45-4e5a-a9a4-93abc2cdb16f")
    public void setHwArbiter_Link_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterLink.MdaTypes.HWARBITER_LINK_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("a62a5658-3b4b-4f02-83e5-67c7dab1c7bd")
    protected HwArbiterLink(final Link elt) {
        super(elt);
    }

    @objid ("03477026-038a-47f5-8487-f4abdff9bfe9")
    public static final class MdaTypes {
        @objid ("77e5708c-f72c-4e29-b6b6-a66b8ffcd1a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a563bfc-d60d-4015-9ad6-b420ae9ffc7f")
        public static TagType HWARBITER_LINK_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("89d73f14-4214-4990-b234-da381ef2f6bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("b81aca35-f7e7-44a6-8b8e-7458c0a23008")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2c1626e1-4501-4390-88ea-69e9e76cca34")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036aea-0ccf-11df-8525-001302895b2b");
            HWARBITER_LINK_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01036af1-0ccf-11df-8525-001302895b2b");
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
